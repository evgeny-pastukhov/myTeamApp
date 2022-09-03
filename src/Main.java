public class Main {
    public static void main(String[] args) {
        Course obs = new Course(new int[]{0, 1, 2, 3, 4}); // Создаем полосу препятствий
        Team team = new Team("DreamTeam", new String[]{"Иван", "Петр", "Сергей", "Валентин"}); // Создаем команду
        obs.doIt(team); // Просим команду пройти полосу
        team.showResult(); // Показываем результаты
    }
}
