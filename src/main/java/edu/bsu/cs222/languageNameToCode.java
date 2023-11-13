package edu.bsu.cs222;

import java.util.HashMap;
import java.util.Map;

public class languageNameToCode {
    public static String mapLanguageNameToCode(String languageName) {
        Map<String, String> languageMappings = new HashMap<>();
        languageMappings.put("Spanish", "es");
        languageMappings.put("Japanese", "ja");
        languageMappings.put("Italian", "it");
        languageMappings.put("Arabic", "ar");
        languageMappings.put("Korean", "ko");
        languageMappings.put("Catalan", "ca");
        languageMappings.put("Simplified Chinese", "zh-CN");
        languageMappings.put("Traditional Chinese", "zh-TW");
        languageMappings.put("Polish", "pl");
        languageMappings.put("Dutch", "nl");
        languageMappings.put("Portuguese", "pt");
        languageMappings.put("Russian", "ru");
        languageMappings.put("French", "fr");
        languageMappings.put("Swedish", "sv");
        languageMappings.put("German", "de");
        languageMappings.put("Greek", "el");
        languageMappings.put("Telugu", "te");
        languageMappings.put("Gujarati", "gu");
        languageMappings.put("Thai", "th");
        languageMappings.put("Hebrew", "iw");
        languageMappings.put("Ukrainian", "uk");
        languageMappings.put("Hindi", "hi");
        languageMappings.put("Urdu", "ur");
        languageMappings.put("Vietnamese", "vi");
        languageMappings.put("Burmese", "my");
        languageMappings.put("Afrikaans", "af");
        languageMappings.put("Albanian", "sq");
        languageMappings.put("Amharic", "am");
        languageMappings.put("Armenian", "hy");
        languageMappings.put("Assamese", "as");
        languageMappings.put("Aymara", "ay");
        languageMappings.put("Azerbaijani", "az");
        languageMappings.put("Bambara", "bm");
        languageMappings.put("Basque", "eu");
        languageMappings.put("Belarusian", "be");
        languageMappings.put("Bengali", "bn");
        languageMappings.put("Bhojpuri", "bho");
        languageMappings.put("Bosnian", "bs");
        languageMappings.put("Bulgarian", "bg");
        languageMappings.put("Cebuano", "ceb");
        languageMappings.put("Corsican", "co");
        languageMappings.put("Croatian", "hr");
        languageMappings.put("Czech", "cs");
        languageMappings.put("Danish", "da");
        languageMappings.put("Dhivehi", "dv");
        languageMappings.put("Dogri", "doi");
        languageMappings.put("Esperanto", "eo");
        languageMappings.put("Estonian", "et");
        languageMappings.put("Ewe", "ee");
        languageMappings.put("Filipino (Tagalog)", "fil");
        languageMappings.put("Finnish", "fi");
        languageMappings.put("Frisian", "fy");
        languageMappings.put("Galician", "gl");
        languageMappings.put("Georgian", "ka");
        languageMappings.put("Guarani", "gn");
        languageMappings.put("Haitian Creole", "ht");
        languageMappings.put("Hausa", "ha");
        languageMappings.put("Hawaiian", "haw");
        languageMappings.put("Hmong", "hmn");
        languageMappings.put("Hungarian", "hu");
        languageMappings.put("Icelandic", "is");
        languageMappings.put("Igbo", "ig");
        languageMappings.put("Ilocano", "ilo");
        languageMappings.put("Indonesian", "id");
        languageMappings.put("Irish", "ga");
        // Add more mappings as needed

        return languageMappings.get(languageName);
    }
}