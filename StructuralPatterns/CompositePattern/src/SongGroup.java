import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent{

    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent songComponentToRemove) {
        songComponents.remove(songComponentToRemove);
    }

    @Override
    public SongComponent getComponent(int componentIndex) {
        return (SongComponent)songComponents.get(componentIndex);
    }

    public void displaySongInfo() {
        System.out.println(getGroupName() + " " +
                    getGroupDescription() + "\n");

        Iterator songIterator = songComponents.iterator();

        while(songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }

}
