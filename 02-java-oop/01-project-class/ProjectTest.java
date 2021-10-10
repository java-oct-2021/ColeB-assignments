public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        System.out.println(project1.getName());
        System.out.println(project1.getDesc());
        System.out.println(project1.elevatorPitch());

        Project project2 = new Project("Link");
        System.out.println(project2.getName());
        System.out.println(project2.getDesc());
        System.out.println(project2.elevatorPitch());

        Project project3 = new Project("Dovahkiin", "Untitled Skyrim Project X");
        System.out.println(project3.elevatorPitch());
        project3.setName("Dragon Five");
        project3.setDesc("The fifth dragon in the series");
        System.out.println(project3.getName());
        System.out.println(project3.getDesc());

    }
}
