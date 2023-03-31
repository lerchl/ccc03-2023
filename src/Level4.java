import java.util.List;

public class Level4 extends Solver {

    public Level4() {
        super(4);
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

            int wholeRocksToPaperRatio = Math.floorDiv(rocks, papers);
            int rocksToPaperRatio = Math.ceilDivExact(rocks, papers);

            boolean morePapersThanSciccors = papers > scissors;
            boolean hasEnoughPapers = papers > 1;

            // boolean removedPaper = false;
            if (morePapersThanSciccors) { // (rocksDivisibleByPapers && rocks % (papers - 1) == 0)
                if (hasEnoughPapers) {
                    rocksToPaperRatio = Math.ceilDivExact(rocks, papers - 1);
                    // removedPaper = true;
                } else {
                    rocksToPaperRatio = 1;
                }
            }

            if (rocks > 0) {
                while (rocks >= rocksToPaperRatio) {
                    for (int i = 0; i < rocksToPaperRatio; i++) {
                        sb.append("R");
                        rocks--;
                    }

                    sb.append("P");
                    papers--;
                }

                if (rocks > 0) {
                    sb.append("P");
                    papers--;

                    while (rocks > 0) {
                        sb.append("R");
                        rocks--;
                    }
                }
            }

            System.out.println(String.format("%d: Papers: %d, Scissors: %d", input.indexOf(line) + 1, papers, scissors));

            if (papers > 0) {
                int papersToScissorsRatio = Math.ceilDivExact(wholeRocksToPaperRatio, scissors);
                // if (scissors > 1 && removedPaper) {
                //     papersToScissorsRatio = Math.ceilDivExact(papers, scissors - 1);
                // }

                while (papers >= papersToScissorsRatio) {
                    for (int i = 0; i < papersToScissorsRatio; i++) {
                        sb.append("P");
                        papers--;
                    }

                    sb.append("S");
                    scissors--;
                }

                if (papers > 0) {
                    sb.append("S");
                    scissors--;

                    while (papers > 0) {
                        sb.append("P");
                        papers--;
                    }
                }
            }

            // while (papers > 0) {
            //     sb.append("P");
            //     papers--;
            // }

            while (scissors > 0) {
                sb.append("S");
                scissors--;
            }

            return sb.toString();
        }).toList();
    }
}
