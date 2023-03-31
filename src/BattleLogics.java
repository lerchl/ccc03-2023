public class BattleLogics {

    public static char fight(char left, char right) {
        if ((left == 'P' && right == 'R') || (left == 'R' && right == 'P')) {
            return 'P';
        } else if ((left == 'P' && right == 'S') || (left == 'S' && right == 'P')) {
            return 'S';
        } else if ((left == 'R' && right == 'R') || (left == 'S' && right == 'R')) {
            return 'R';
        }

        return left;
    }
}
