import java.util.List;

public class Level2 extends Solver {

    public Level2() {
        super(2);
    }

    // /////////////////////////////////////////////////////////////////////////
    // Methods
    // /////////////////////////////////////////////////////////////////////////

    @Override
    protected List<String> solve(List<String> input) {
        input.remove(0);
        return input.stream().map(this::round).map(this::round).toList();
    }

    private String round(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i += 2) {
            var left = input.charAt(i);
            var right = input.charAt(i + 1);
            sb.append(BattleLogics.fight(left, right));
        }
        return sb.toString();
    }
}
