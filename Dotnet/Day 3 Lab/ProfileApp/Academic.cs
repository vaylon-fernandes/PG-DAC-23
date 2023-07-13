namespace PMS
{
    public partial class Profile
    {
        public string qualification;
        public string grade;

        public override string ToString()
        {
            String data = String.Format("{0} {1} {2} {3}", this.firstName, this.lastName, this.qualification, this.experience);
            return data;
        }
    }
}