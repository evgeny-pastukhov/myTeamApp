public class Course {
    int[] obs;
    public Course(int[] obs){
        this.obs = obs;
    }
    public void doIt(Team team) {
        System.out.println(team.name + "начинает проходить препятствия");
        for (int i=0; i< obs.length; i++){
            System.out.println("Проходим препятствие " +i);
            for (int j = 0; j < team.members.length; j++){
                if (!team.result[j]) continue;
                team.result[j] = ((Math.random() * 9 + 1)>obs[i]); // вставить рандом
                if (team.result[j]) System.out.println(team.members[j] + " Прошёл"); else {
                    System.out.println(team.members[j] + " Не прошёл");
                };
            }
        }

    };
}
