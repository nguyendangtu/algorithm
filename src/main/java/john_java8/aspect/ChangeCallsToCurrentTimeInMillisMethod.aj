package john_java8.aspect;

public aspect ChangeCallsToCurrentTimeInMillisMethod {
        long around():
        call(public static native long java.lang.System.currentTimeMillis())
        && within(user.code.base.pckg.*) {
        return 0;
        }

}
