public abstract class Person implements Payable{
    private int id;
    private static int idGen=1;
    private String name,surname;
    public Person(){
        id=idGen++;
    }
    public Person(String name,String surname){
        this.name=name;
        this.surname=surname;
        id=idGen++;
    }
    @Override
    public String toString() {
        return getId() +
                ". " + getName() + ' ' + getSurname();
    }
    public abstract String getPosition();

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }
}
