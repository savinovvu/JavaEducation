package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case ("-c"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        try {
                            Date birthDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2]);

                            switch (args[i + 1]) {
                                case ("м"):
                                    allPeople.add(Person.createMale(args[i], birthDate));
                                    break;
                                case ("ж"):
                                    allPeople.add(Person.createFemale(args[i], birthDate));
                                    break;
                                default:
                                    break;

                            }
                        } catch (ParseException e) {
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case ("-u"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        Person uPerson = allPeople.get(Integer.parseInt(args[i]));
                        uPerson.setName(args[i + 1]);
                        switch (args[i + 2]) {
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
                            uPerson.setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            case ("-d"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person dPerson = allPeople.get(Integer.parseInt(args[i]));
                        dPerson.setName(null);
                        dPerson.setSex(null);
                        dPerson.setBirthDate(null);
                    }
                }
                break;

            case ("-i"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        String name = allPeople.get(Integer.parseInt(args[i])).getName();
                        String sex = null;
                        switch (allPeople.get(Integer.parseInt(args[i])).getSex()) {
                            case MALE:
                                sex = "м";
                                break;
                            case FEMALE:
                                sex = "ж";
                                break;
                            default:
                                break;
                        }
                        String birthDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[i])).getBirthDate());
                        System.out.println(name + " " + sex + " " + birthDate);
                    }
                }
                break;


            default:
                synchronized (allPeople) {}
                break;
        }
    }
}
