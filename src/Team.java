import javax.naming.Name;

public class Team {
    public String name;
    boolean[] result = new boolean[4];
    String[] members = new String[4];
    public Team(String name, String[] members) {
        this.name=name;
        this.members[0] = members[0];
        this.members[1] = members[1];
        this.members[2] = members[2];
        this.members[3] = members[3];
        for (int i=0; i<members.length;i++)
            this.result[i]=true;

    }
    public void showMembers(){
        System.out.println("Список участников");
        for (int i=0;i<members.length;i++)
        System.out.println(this.members[i]);
    }
    public void showResult(){
        System.out.println("Список участников прошедших дистанцию");
        for (int i=0; i<members.length;i++){
            if (result[i]) {
                System.out.println(this.members[i]);
            };
        };
    }


}
