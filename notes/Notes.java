//Класс+конструктор+вывод в строку:

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Artem", 26, "Lenina");
        System.out.println(man.toString());
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

}

    // вывод текщей даты
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }

    // BufferedReader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    int nAge = Integer.parseInt(reader.readLine());
reader.close();

// min через массив

        import java.util.*;// import в начале
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]nums=new int[5];
        for(int i=0;i< 5;i++){
        nums[i]=Integer.parseInt(reader.readLine());
        }
        int minimum=min(nums);
        System.out.println("Minimum = "+minimum);
        }

public static int min(int[]arr){
        Arrays.sort(arr);
        return arr[0];
        }


//min через функцию
public static void main(String[]args)throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        int d=Integer.parseInt(reader.readLine());
        int e=Integer.parseInt(reader.readLine());

        int minimum=min(a,b,c,d,e);

        System.out.println("Minimum = "+minimum);
        }

public static int min(int a,int b,int c,int e,int d){
        return Math.min(Math.min(Math.min(Math.min(a,b),c),d),e);
        }
// max число
        import java.util.*;// import в начале
public static void main(String[]args)throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int number=Integer.parseInt(reader.readLine());
        int[]nums=new int[number];
        for(int i=0;i<number; i++){
        nums[i]=Integer.parseInt(reader.readLine());
        }
        int maximum=max(nums);
        reader.close();
        System.out.println(maximum);
        }
public static int max(int[]nums){
        Arrays.sort(nums);
        return nums[nums.length-1]; // для миимального [0]
        }
        // min max Array
        int x=Arrays.stream(inputArray).min().getAsInt();
        int y=Arrays.stream(inputArray).max().getAsInt();
// метод вывода элементов массива построчно
public static void printCats(){
        for(int i=0;i<cats.size();i++){
        System.out.println(cats.get(i));
        }
//Тернарный оператор
        String a=(even<odd)?"В домах с нечетными номерами проживает больше жителей.":"В домах с четными номерами проживает больше жителей.";
        System.out.println(a);
// заполнение массива
        List<String>collect=IntStream.range(0,5).mapToObj(v->"string").collect(Collectors.toList());

        //вывод массива list построчно
        list.forEach(System.out::println);
// удаление диапазона индексов в массиве
        longestStrings.subList(0,longestStrings.size()).clear();
// переименовать переменную
        shift+f6
// заполнение списка
        import java.util.*; // в импорт
        ArrayList<String> Mam=new ArrayList<>();
        Collections.addAll(Mam,"мама","мыла","раму");
// создание и заполнение массива методом
        int[]array=getInts(); // вызывает метод в main
// сам метод
public static int[]getInts()throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]arr=new int[20];
        for(int i=0;i< 20;i++){
        arr[i]=Integer.parseInt(reader.readLine());
        }
        reader.close();
        return arr;
        }
// заполнение массива до
        ArrayList<String> list=new ArrayList<>();
        while(true){
        String s=reader.readLine();
        if(s.equals("end")){
        break;
        }
        else
        list.add(s);
        }
// заполнять массив пока не будет пустого значения
        while(true){
        String string=reader.readLine();
        if(string==null||string.isEmpty())break;
        strings.add(string);
        }
//Удалить всю строку
        ctrl+y
// массив по возрастанию
        Arrays.sort(array);
        if(array==null){
        return;
        }
        int i=0;
        int j=array.length-1;
        int tmp;
        while(j>i){
        tmp=array[j];
        array[j]=array[i];
        array[i]=tmp;
        j--;
        i++;
        }
        // заполнение бесконечного массива
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int count=1;
        List<Integer> num=new ArrayList<>();
        for(int i=0;i<=count;i++){
        int number=Integer.parseInt(reader.readLine());
        num.add(number);
        count++;}
//Ввод даты с буфера и перевод с другой формат.
        {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String dataStr=reader.readLine();
        SimpleDateFormat dfIn=new SimpleDateFormat("yyyy-MM-dd");
        Date date=dfIn.parse(dataStr);
        SimpleDateFormat dfOut=new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        System.out.println(dfOut.format(date).toUpperCase());
        }


// Сортировка массива буквы по возрастанию, числа по убыванию
//// Начало
public static void main(String[]args)throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();
        String line=reader.readLine();
        while(!line.isEmpty()){
        list.add(line);
        line=reader.readLine();
        }

        String[]array=list.toArray(new String[0]);
        sort(array);

        for(String x:array){
        System.out.println(x);
        }
        }
public static void sort(String[]array){
        // напишите тут ваш код
        for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
        if(isNumber(array[i])&&isNumber(array[j])){
        if(Integer.parseInt(array[i])<Integer.parseInt(array[j])){
        String temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        }
        }else if(!isNumber(array[i])&&!isNumber(array[j])){
        if(isGreaterThan(array[i],array[j])){
        String temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        }
        }
        }
        }
        }

// Метод для сравнения строк: 'а' больше чем 'b'
public static boolean isGreaterThan(String a,String b){
        return a.compareTo(b)>0;
        }


// Переданная строка - это число?
public static boolean isNumber(String text){
        if(text.length()==0){
        return false;
        }

        char[]chars=text.toCharArray();
        for(int i=0;i<chars.length;i++){
        char character=chars[i];

        // есть '-' внутри строки
        if(i!=0&&character=='-'){
        return false;
        }

        // не цифра и не начинается с '-'
        if(!Character.isDigit(character)&&character!='-'){
        return false;
        }

        // одиночный '-'
        if(chars.length==1&&character=='-'){
        return false;
        }
        }

        return true;
        }

        //// Конец
// Вывод всех элементов Map
        for(Map.Entry entry:list.entrySet()){
        System.out.println(entry.getValue()+" "+entry.getKey());
        }


// считать путь файла из консоли и записывать строки из консоли пока не введен "exit"
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file=reader.readLine();
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        String text;
        while(!(text=reader.readLine()).equals("exit")){
        bw.write(text+"\n");
        bw.flush();
        }
        bw.write("exit"+"\n");
        bw.flush();
        reader.close();
        bw.close();
// считать путь файла, считать из файла чила, отсортировать четные по возрастанию
public static void main(String[]args)throws IOException{
        // напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String path=reader.readLine();
        InputStream inStream=new FileInputStream(path);
        Scanner scanner=new Scanner(inStream);
        List<Integer> list=new ArrayList<Integer>();
        while(scanner.hasNext()){
        list.add(scanner.nextInt());
        }
        reader.close();
        inStream.close();
        Collections.sort(list);
        for(int ell:list){
        if(ell%2==0){
        System.out.println(ell);
        }
        }
        }

// Чтение одного файла и запись из него в два других пополам, если нечетное количество то большее количество в первый
public static void main(String[]args)throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String pathInFile=reader.readLine();
        String pathOutFileFirst=reader.readLine();
        String pathOutFileSecond=reader.readLine();
        reader.close();
        InputStream inFile=new FileInputStream(pathInFile);
        OutputStream outFileFirst=new FileOutputStream(pathOutFileFirst);
        OutputStream outFileSecond=new FileOutputStream(pathOutFileSecond);
        int halfOfFile=(inFile.available()+1)/2;
        int numberOfByte=0;
        while(inFile.available()>0){
        if(numberOfByte<halfOfFile){
        outFileFirst.write(inFile.read());
        numberOfByte++;
        }else{
        outFileSecond.write(inFile.read());
        }
        }
        inFile.close();
        outFileFirst.close();
        outFileSecond.close();
        }

        // плагины
        Rainbow Brackets-разноцветные скобки
        HighlightBracketPair-работа со скобками
        Color Scheme/Language Defaults/Semantic highlighting-разноцветные пересенные в настройках
        // переключение раскладки клавиатуры Ubuntu Alt + Shift
        $sudo apt install gnome-tweaks
        $gsettings set org.gnome.desktop.input-sources xkb-options"['grp:alt_shift_toggle']"