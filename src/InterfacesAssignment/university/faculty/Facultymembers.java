package InterfacesAssignment.university.faculty;

import InterfacesAssignment.university.courses.Display;

public class Facultymembers implements Display {
    private int memberId;
    private String name;
    private String bloodGroup;
    private long contactNumber;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Facultymembers(int memberId, String name, String bloodGroup, long contactNumber) {
        this.memberId = memberId;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.contactNumber = contactNumber;
    }

    @Override
    public void print() {
        System.out.println("Staff Details are");
        System.out.println("Staff Name "+getName()+"\t"+"Staff Id "+getMemberId()+"\t"+"Staff Blood Group "+getBloodGroup()+"\t"+"Staff Contact Number "+getContactNumber());
    }
}
