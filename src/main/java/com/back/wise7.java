package com.back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 7단계 예외처리
public class wise7 {
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
            } else if (cmd.startsWith("삭제?id=")) {
                int delete_id = Integer.parseInt(cmd.split("=")[1]);
                int d = 0;

                for (int i = 0; i < wiseList.size(); i++) {
                    int wise_id = Integer.parseInt(wiseList.get(i).split(" / ")[0]);

                    if (wise_id == delete_id) {
                        wiseList.remove(i);
                        System.out.println(delete_id + "번 명언이 삭제되었습니다.");
                        d++;
                        break;
                    }
                }

                if (d == 0) {
                    System.out.println(delete_id + "번 명언은 존재하지 않습니다.");
                }
            }

        }

        scanner.close();
    }
}
