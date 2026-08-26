package com.personalstudyplanner.util;
import java.util.regex.Pattern;
public final class InputValidator {private InputValidator(){}public static boolean validEmail(String email){return email!=null&&Pattern.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$",email);}public static boolean validHours(int h){return h>=0&&h<=24;}public static boolean validProgress(int p){return p>=0&&p<=100;}}
