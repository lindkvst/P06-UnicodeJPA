package org.example.p06unicodejpa.config;

import org.example.p06unicodejpa.model.Unicode;
import org.example.p06unicodejpa.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {

        Set<Character> unicodeChars = new HashSet<>();

        //Havde problemer med rate limits i MySQL, så begrænsede loopet til 1000 chars
        //for (int i = 0; i <= Character.MAX_VALUE; i++) {
        for (int i = 0; i <= 1000; i++) {
            Character c = (char) i;

            if (Character.isLetter(i)) {
                unicodeChars.add(c);
            }
        }


        for (Character c : unicodeChars) {
            Unicode uc = new Unicode();
            uc.setUnicode(c.hashCode());
            uc.setSymbol(c);

            unicodeRepository.save(uc);
        }


    }
}
