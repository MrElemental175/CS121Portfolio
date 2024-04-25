public class Move {
    private String moveName;
    private int movePower;
    private int moveSpeed;

    public Move(String moveName, int movePower, int moveSpeed) {
        this.moveName = moveName;
        this.movePower = movePower;
        this.moveSpeed = moveSpeed;
    }

    public String getMoveName() {
        return moveName;
    }

    public int getMovePower() {
        return movePower;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    @Override
    public String toString() {
        return String.format("Move: %s\nPower: %d\nSpeed: %d\n", moveName, movePower, moveSpeed);
    }
}
