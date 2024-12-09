
//receiver


class Light implements Device{
    private boolean ligado;
    @Override
    public void turnOn(){
        //logica de ligar a luz
        ligado = true;
    }

    @Override
    public void turnOff(){
        //Logica de desligar a luz
        ligado = false;
    }
}
