import java.util.ArrayList;
import java.util.List;

public class Level3 extends Solver {

    public Level3() {
        super(3);
    }

    // /////////////////////////////////////////////////////////////////////////
    // Methods
    // /////////////////////////////////////////////////////////////////////////

    @Override
    protected List<String> solve(List<String> input) {
        input.remove(0);

        return input.stream().map(line -> {
            var parts = line.split(" ");

            var rocks = Integer.parseInt(parts[0].replaceAll("\\D", ""));
            var papers = Integer.parseInt(parts[1].replaceAll("\\D", ""));
            var scissors = Integer.parseInt(parts[2].replaceAll("\\D", ""));

            StringBuilder sb = new StringBuilder();
            while (rocks >= 3) {
                sb.append("R");
                sb.append("R");
                sb.append("R");
                rocks -= 3;

                sb.append("P");
                papers--;
            }

            while (rocks > 0) {
                sb.append("R");
                rocks--;

                if (papers == 0) {
                    sb.append("S");
                    scissors--;
                } else {
                    sb.append("P");
                    papers--;
                }
            }

            while (papers > 0) {
                sb.append("P");
                papers--;
            }

            while (scissors > 0) {
                sb.append("S");
                scissors--;
            }

            return sb.toString();
        }).toList();
    }

    // private String round(String input) {
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < input.length() - 1; i += 2) {
    //         var left = input.charAt(i);
    //         var right = input.charAt(i + 1);
    //         sb.append(BattleLogics.fight(left, right));
    //     }
    //     return sb.toString();
    // }
}
