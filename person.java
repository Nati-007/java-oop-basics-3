public class person {
    private  String Name;
    private String gender;
    private String address;
    private long PhoneNumber;
    private double height;
    private double weight;
    private String DOB;
    private String profession;
    private String email;
    private String MaritalStatus;
    private long IDNumber;

    public void setName(String Name){
        this.Name=Name;
    }
    public void setGender(String Gender){
        this.gender=Gender;
    }
    public void setAddress(String Address){
        this.address=Address;
    }
    public void setPhoneNumber(long PhoneNumber){
        this.PhoneNumber=PhoneNumber;
    }
    public void setHeight(double Height){
        this.height=Height;
    }
    public void setWeight(double Weight){
        this.weight=Weight;
    }
    public void setDOB(String DOB){
        this.DOB=DOB;
    }
    public void setProfession(String Profession){
        this.profession=Profession;
    }
    public void setEmail(String Email){
        this.email=Email;
    }
    public void setMaritalStatus(String MaritalStatus){
        this.MaritalStatus=MaritalStatus;
    }
    public void setIDNumber(long IDNumber){
        this.IDNumber=IDNumber;
    }
    public String getName(){
        return Name;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public long getPhoneNumber(){
        return PhoneNumber;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public String getDOB(){
        return DOB;
    }
    public String getProfession(){
        return profession;
    }
    public String getEmail(){
        return email;
    }
    public String getMaritalStatus(){
        return MaritalStatus;
    }
    public long getIDNumber(){
        return IDNumber;
    }

    public person(){
        this.Name="Nati";
        this.gender="Male";
        this.address="R.D.48320";
    }

    public person(long PhoneNumber , double Height , double Weight){
        this.PhoneNumber=PhoneNumber;
        this.height=Height;
        this.weight=Weight;
    }

    public person(String DOB , String Profession , String Email , String MaritalStatus , long IDNumber){
        this.DOB=DOB;
        this.profession=Profession;
        this.email=Email;
        this.MaritalStatus=MaritalStatus;
        this.IDNumber=IDNumber;
    }

    public person(person otherperson){
        this.Name=otherperson.Name;
        this.gender=otherperson.gender;
        this.address=otherperson.address;
        this.PhoneNumber=otherperson.PhoneNumber;
        this.height=otherperson.height;
        this.weight=otherperson.weight;
        this.DOB= otherperson.DOB;
        this.profession=otherperson.profession;
        this.email=otherperson.email;
        this.MaritalStatus=otherperson.MaritalStatus;
        this.IDNumber=otherperson.IDNumber;
    }

    public String toString(){
        return " Person { Name = " + getName() + ',' + "Gender = " + getGender()+ ',' + "Address = " + getAddress()+ ',' + "Phone Num = "
               + getPhoneNumber()+ ',' + "Height = " + getHeight()+ ',' + "Weight = " + getWeight()+ ',' + "DOB = " + getDOB()+ ',' + "Profession = "
                + getProfession()+ ',' +  "Email = " + getEmail()+ ',' + "MaritalStatus = " + getMaritalStatus()+ ',' + "IDNumber = "
                + getIDNumber()+ ',' + "}";
    }
}