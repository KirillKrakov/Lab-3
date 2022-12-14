package humans;

import enums.EmotionalCondition;
import enums.Place;

public class FrekenBok extends Human {
    private String legs;
    public FrekenBok(String name, int age, Place location, EmotionalCondition condition){
        super(name,age,location,condition);
    }

    @Override
    public void look(String something) {
        if (this.getCondition() == EmotionalCondition.ANGER) {
            System.out.println(getName() + " мрачно глядит на " + something);
        } else{
            System.out.println(getName() + " смотрит на " + something);
        }
    }

    @Override
    public void haveFeelingsForSomeone(Human otherHuman) {
        if (this.getCondition() == EmotionalCondition.ANGER) {
            System.out.println(this.getName() + " покраснела от гнева из-за " + otherHuman.getName());
        }
    }

    @Override
    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public String getLegs(){
        return legs + " " + getName();
    }
}
