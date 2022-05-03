package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {


        switch (args[0]) {
            case ("-c"):
                try {
                    Date birthDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);

                    switch (args[2]) {
                        case ("м"):
                            allPeople.add(Person.createMale(args[1], birthDate));
                            break;
                        case ("ж"):
                            allPeople.add(Person.createFemale(args[1], birthDate));
                            break;
                        default:
                            break;

                    }
                } catch (ParseException e) {
                }
                System.out.println(allPeople.size()-1);
                break;
            case ("-r"):

                String name = allPeople.get(Integer.parseInt(args[1])).getName();
                String sex = null;
                switch (allPeople.get(Integer.parseInt(args[1])).getSex()) {
                    case MALE:
                        sex = "м";
                        break;
                    case FEMALE:
                        sex = "ж";
                        break;
                    default:
                        break;
                }
                String.valueOf(allPeople.get(Integer.parseInt(args[1])).getSex());
                String birthDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());
                System.out.println(name + " " + sex + " " + birthDate);
                break;
            case ("-u"):
                Person uPerson = allPeople.get(Integer.parseInt(args[1]));
                uPerson.setName(args[2]);
                switch (args[3]) {
                    case ("м"):
                        uPerson.setSex(Sex.MALE);
                        break;
                    case ("ж"):
                        uPerson.setSex(Sex.FEMALE);
                        break;
                    default:
                        break;
                }
                try {
                    uPerson.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case ("-d"):
                Person dPerson = allPeople.get(Integer.parseInt(args[1]));
                dPerson.setName(null);
                dPerson.setSex(null);
                dPerson.setBirthDate(null);
                break;
            default:
                break;
        }

        //напишите тут ваш код
    }
}
