Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
1) Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов на кансоль
3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) и отсортировать группы студентов в потоке, а затем вывести в консоль

(задача со *)
1) Отсортировать группы студентов в потоке сначало по количеству студентов, а затем по идентификатору группы
2) Переопределить методы ToString классов StudentGroup(выводить идентификатор группы, количество студентов и список студентов) и StudentSteam(выводить номер потока, количество групп и список студентов с указанием идентификатора группы)

Формат сдачи: ссылка на гитхаб проект

Урок 4. ООП: Обобщения. ч1
1) Создать класс TeacherService и реализовать аналогично проделанному на семинаре. Подключить обобщенный интерфейс iPersonService. Добавить метод вывода списка учителей отсортированного обобщенным классом PersonComparator
2) Разработать обобщенный метод averageAge для подсчета среднего возраста студентов, учителей и работников. Вывести результат работы класса на консоль. Метод сделать статическим в классе AccountController.

(Задача со *) Переписать иерархию Person->Student/WorkingPerson->Teacher/Emploee в иерархию обобщенных типов.

Формат сдачи: ссылка на гитхаб проект
