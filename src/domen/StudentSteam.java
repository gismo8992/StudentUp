package domen;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Класс StudentSteam
 * Представляет собой структуру для создания объектов типа "StudentSteam" с номером потока и списком групп на потоке
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private int steamNumber;
    private List<StudentGroup> studentGroupList;

    public StudentSteam(int steamNumber, List<StudentGroup> studentGroupList) {
        this.steamNumber = steamNumber;
        this.studentGroupList = studentGroupList;
    }

    public int getSteamNumber() {
        return steamNumber;
    }

    public void setSteamNumber(int steamNumber) {
        this.steamNumber = steamNumber;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "steamNumber=" + steamNumber + ", steamSize " + studentGroupList.size() +
                ", studentGroupList=" + studentGroupList +
                '}';
    }

    /**
     * @apiNote Метод для прохождения по элементам списка, который представляет собой список групп студентов на потоке
     * @return элемент Iterator<StudentGroup>
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = -1;

            @Override
            public boolean hasNext() {
                return index + 1 < studentGroupList.size();
            }

            @Override
            public StudentGroup next() {
                index++;
                if (index >= 0 && index < studentGroupList.size()) {
                    return studentGroupList.get(index);
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
