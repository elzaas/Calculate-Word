package org.example;
public class Count {
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {//проверяем на пустую строку
            return 0;
        }
        int count = 1;//счетчик
        for (int i = 0; i < sentence.length(); ++i) {
            if (sentence.charAt(i) == ' ') {//проверка пробела
                if (i + 1 < sentence.length() && sentence.charAt(i + 1) != ' ') {
                    count++;
                }
            }
        }
        return count; //возвращаем конечный ответ
    }
}

