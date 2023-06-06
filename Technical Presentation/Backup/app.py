from flask import Flask, make_response, jsonify
from flask.templating import render_template
import requests
from bs4 import BeautifulSoup

app = Flask(__name__)
url = "https://en.wikipedia.org/wiki/Special:Random"


@app.route("/")
def home():
    return render_template("index.html")


def find_intro(content):
    for paragragh in content:
        if paragragh.text != "\n":
            return paragragh.text


@app.route("/getArticle", methods=["GET"])
def scrape_article():
    """Gets a random wiki article and scrapes the title and intro
    Return: Json response with title and intro
    """

    response = requests.get(url)
    soup = BeautifulSoup(response.content, "html.parser")
    title = soup.find(id="firstHeading").text
    content = soup.find(id="mw-content-text").find_all("p")
    intro = find_intro(content)
    wiki_link = f"https://en.wikipedia.org/wiki/{title}".replace(" ", "%20")
    return make_response(
        jsonify({"title": title, "intro": intro, "link": wiki_link}), 200
    )
