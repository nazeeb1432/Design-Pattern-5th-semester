// Composite
import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching in Folder: " + name);
        for (FileSystemComponent component : components) {
            component.search(keyword);
        }
    }
}

