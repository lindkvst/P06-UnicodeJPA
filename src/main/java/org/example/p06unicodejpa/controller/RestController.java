package org.example.p06unicodejpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int i = (int) c;
        return "char="  + c + " unicode=" + i;
    }

    @GetMapping("charsequence/{c}/{i}")
    public String charToSequence(@PathVariable char c, @PathVariable int amount) {
        String sequence = "";

        for (int i = 0; i <= amount; i ++) {

            sequence = sequence + (char) i +
        }
    }
}
