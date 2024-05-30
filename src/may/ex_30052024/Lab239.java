package src.may.ex_30052024;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Lab239 {
    public static void main(String[] args) {
        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");
        ttacourseList.add(123);
        ttacourseList.add(true);
        ttacourseList.add(3.14f);

//        Iterator iterator = ttacourseList.iterator();
//        while (iterator.hasNext()) {
//            ttacourseList.add("pramod");
//            System.out.println(iterator.next());
//        }

//        for (Object course :ttacourseList){
//            System.out.println(course);
//        }
//
//        for (int i = 0; i < ttacourseList.size() ; i++) {
//            System.out.println(ttacourseList.get(i));
//        }
//
//        // List - ArrayList, LinkedList
//        ListIterator lt = ttacourseList.listIterator();
//        while(lt.hasNext()){
//            lt.add("Gen AI");
//            System.out.println(lt.next());
//        }

        // ATB, MTB, PyATB, LAPIT, SDET Blueprint

        ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
        while(lt2.hasPrevious()){
            //ttacourseList.add("Gen AI");
            lt2.add("Gen AI");
            //System.out.println(lt2.hasPrevious());
        }

        System.out.println(ttacourseList);



    }
}
