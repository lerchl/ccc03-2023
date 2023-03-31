import java.util.List;

public class Level1 extends Solver {

    public Level1() {
        super(1);
    }

    // /////////////////////////////////////////////////////////////////////////
    // Methods
    // /////////////////////////////////////////////////////////////////////////

    @Override
    protected List<String> solve(List<String> input) {
        input.remove(0);
        return input.stream().map(str -> {
            var left = str.charAt(0);
            var right = str.charAt(1);
            return Character.toString(BattleLogics.fight(left, right));
        }).toList();
    }
}
