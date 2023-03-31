public class Tournament {
    
                                      //RRRRRPRRRRRPRRRRRPRRRRRPRRRRRPSS
    private static String tournament = "RRPRRPRRPRRPRRPRRPRRPRRPPSPSSSSS";
    // private static String tournament = "RRRRRPRRRRRPRRRRRPRRRRRPRRRRRP";
    
    private static String[] tournaments = {
        "RRRRRRRPRRRRRRRPPRRRRRRSSSSSSSSS",
        "RPPSPSPSPSPSPSPSPSPSPSPSPSSSSSSS",
        "RRRRRRRPRRRRRRRPRRRRRRRPPRRRRPSS",
        "RPRPRPPSSSSSSSSSSSSSSSSSSSSSSSSS",
        "RRRRRRPRRRRRRPRRRRRRPRRRRRRPPSSS",
        "RPRPRPRPRPRPPSSSSSSSSSSSSSSSSSSS",
        "RRRRRRRRRPRRRRRRRRRPPRRRRRRRPSSS",
        "RRPRRPRRPRRPRRPRRPRRPRRPPSPSSSSS",
        "RRPRRPRRPRRPRRPRRPRRPRRPSSSSSSSS",
        "RRRPRRRPRRRPRRRPRRRPRRRPRRRPPSSS",
        "RPPPSPPSPPSPPSPPSPPSPPSPPSSSSSSS",
        "RPRPRPPSPSSSSSSSSSSSSSSSSSSSSSSS",
        "RRRRRRRRPSSSSSSSSSSSSSSSSSSSSSSS",
        "RRRPRRRPRRRPRRRPRRRPRRRPPRPPSSPS",
        "RRRRRRRRRPRRRRRRRRRPPRRRRRRRRPSS",
        "RPRPRPRPRPRPRPRPRPPSPSPSPSSSSSSS",
        "RRRRRRRRRRRPSSSSSSSSSSSSSSSSSSSS",
        "RPRPRPRPRPRPRPRPRPRPRPPPPPPPPPSS",
        "RPRPRPPSPSPSPSPSPSPSPSPSSSSSSSSS",
        "RRRRRRPRRRRRRPRRRRRRPRRRRRRPSSSS",
        "RPRPRPRPRPRPRPRPRPRPPPPSPPPSSPPS",
        "RRRRPRRRRPRRRRPRRRRPPRSSSSSSSSSS",
        "RRRRRRRPRRRRRRRPPRRRRRSSSSSSSSSS",
        "RPRPRPRPRPRPRPRPRPRPRPRPPPPPPPPS",
        "RRPRRPRRPRRPRRPRRPRRPRRPPRPPPPSS",
        "RRRRRRRRPRRRRRRRRPPRRRRRRRSSSSSS",
        "RRPRRPRRPRRPRRPRRPRRPPPPSPPPSSPS",
        "RRRPRRRPRRRPRRRPRRRPRRRPRRRPPPPS",
        "RPRPRPRPRPRPRPRPRPRPRPPSPSPSPSSS",
        "RRPRRPRRPRRPRRPRRPRRPSSSSSSSSSSS",
        "RRRRPRRRRPRRRRPRRRRPPSSSSSSSSSSS",
        "RRRRPRRRRPRRRRPRRRRPRRRRPSSSSSSS",
        "RRPRRPRRPRRPPRPSPSSSSSSSSSSSSSSS",
        "RRRRRRRPRRRRRRRPPRRRRRSSSSSSSSSS",
        "RRPRRPRRPRRPRRPRRPRRPPRPPPSPPPSS",
        "RPRPRPRPRPPPPPPSPPPPPSPPPPPSSPPS",
        "RPRPRPRPRPPPSPPSPPSPPSPPSPPSSSSS",
        "RPRPRPRPRPRPRPRPRPRPPPPPPPPPPPPS",
        "RRPRRPRRPRRPRRPRRPRRPRRPPPPSSPPS",
        "RRRRRRRPRRRRRRRPPRRRRRSSSSSSSSSS",
        "RRRRRRRRRRRRRRRPSSSSSSSSSSSSSSSS",
        "RPRPRPRPRPRPRPRPRPRPRPPPPPPPPPPS",
        "RRRRPRRRRPRRRRPRRRRPPRRRSSSSSSSS",
        "RRRRPRRRRPRRRRPRRRRPSSSSSSSSSSSS",
        "RRRRRPRRRRRPRRRRRPRRRRRPPRPSSSSS",
        "RRRRRRRRRRPRRRRRRRRRRPSSSSSSSSSS",
        "RRRPRRRPRRRPRRRPRRRPSSSSSSSSSSSS",
        "RPRPPPSPPSPPSPPSPPSPPSPPSPPSPPSS",
        "RRRRRPRRRRRPPRRRSSSSSSSSSSSSSSSS",
        "RRRPRRRPRRRPRRRPRRRPRRRPPRRPSPSS"
    };

    public static void main(String[] args) {
        many();
    }

    public static void many() {
        for (int i = 0; i < tournaments.length; i++) {
            int participants = 32;

            while (participants > 1) {
                tournaments[i] = round(tournaments[i]);
                participants /= 2;
            }

            System.out.println(tournaments[i]);
        }
    }

    public static void one() {
        int participants = 32;

            while (participants > 1) {
                System.out.println(tournament);
                tournament = round(tournament);
                participants /= 2;
            }

            System.out.println(tournament);
    }

    private static String round(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i += 2) {
            var left = input.charAt(i);
            var right = input.charAt(i + 1);
            sb.append(BattleLogics.fight(left, right));
        }
        return sb.toString();
    }
}
