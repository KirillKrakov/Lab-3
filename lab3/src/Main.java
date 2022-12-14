import enums.*;
import humans.*;
import items.*;

public class Main {
    public static void main(String[] args) {
        Place in_door = Place.IN_THE_DOORWAY;
        Place in_room = Place.IN_THE_ROOM;
        Place near_window = Place.NEAR_THE_WINDOW;
        Place on_roof = Place.ON_THE_ROOF;
        Human fr_bok = new FrekenBok("Фрекен Бок", 60, in_door,EmotionalCondition.CALMNESS);
        fr_bok.setLegs("большие, чисто вымытые босые ноги");
        Human kid = new Kid("Малыш", 7,in_room,EmotionalCondition.CALMNESS);
        SoundMakingItem bell = new Bell("Колокольчик", on_roof,ActivationState.NOT_ACTIVATED, Sound.RINGING);
        AttachedItem cord = new Cord("Шнур",near_window, ActivationState.NOT_ACTIVATED, bell);
        kid.locate();
        fr_bok.locate();
        cord.locate();
        bell.locate();
        fr_bok.move(in_room);
        kid.look(fr_bok.getLegs());
        kid.feel(EmotionalCondition.FEAR);
        fr_bok.feel(EmotionalCondition.ANGER);
        kid.look(fr_bok.getName());
        fr_bok.look(kid.getName());
        kid.haveFeelingsForSomeone(fr_bok);
        fr_bok.move(near_window);
        kid.move(near_window);
        kid.use(cord);
        cord.beUsed();
        cord.activateAttachedItem();
        bell.beUsed();
        bell.makeSound(bell.getSound());
        fr_bok.hear(Sound.RINGING);
        kid.hear(Sound.RINGING);

        // проверка equals, hashCode, toString
        System.out.println(kid.hashCode());
        System.out.println(bell.hashCode());
        System.out.println(kid.equals(kid));
        System.out.println(cord.equals(bell));
        System.out.println(kid);
        System.out.println(cord);
    }
}