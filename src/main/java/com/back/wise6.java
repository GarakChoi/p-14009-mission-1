package com.back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class wise6 {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);
        int id = 1;
        List<String> wiseList= new ArrayList<>();

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine().trim();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String wiseSayingContent = scanner.nextLine().trim();
                System.out.print("작가 : ");
                String wiseSayingAuthor = scanner.nextLine().trim();

                wiseList.add(id + " / " + wiseSayingAuthor + " / " + wiseSayingContent);
                System.out.println(id + "번 명언이 등록되었습니다.");
                id++;
            } else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------");
                for (int i = wiseList.size() - 1; i >= 0; i--) {
                    System.out.println(wiseList.get(i));
                }
            }
        }

        scanner.close();
    }
}
