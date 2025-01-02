package com.company;
interface babaji{
    void standard();
    void level();
}
interface papa{
    void status();
    void passion();
}
class son implements papa,babaji{
    public void standard(){};
    public void level(){};
    public void status(){};
    public void passion(){};
}
public class interfaceclass {
    public static void main(String[] args) {
        son dhruv=new son();

    }
}
