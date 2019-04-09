public class PopStars extends Creature {

    @Override
    public Node chooseNextRoom() {
        return lookforPlayer();
    }

    public Node lookforPlayer() {
        return null;
    }

    public void act() {
        super.act();

        if(getCurrentRoom().contains( player )) {
            Item item = player.removeRandomItem(name);
            if(item != null) {
                this.addItem(item);
            }
        }
    }
    //    public void decreasePlayerLifeForce();
}
