package factory.method.leifeng2;

import factory.method.leifeng1.LeiFeng;
import factory.method.leifeng1.Volunteer;

class VolunteerFactory implements IFactory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
