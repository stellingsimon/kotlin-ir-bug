# Demonstrate KT-...

Clone the repo, then run

```
$ ./gradlew test
...
> Task :test FAILED

KotlinIcBugApplicationTests > contextLoads() FAILED
    java.lang.IllegalStateException at DefaultCacheAwareContextLoaderDelegate.java:132
        Caused by: org.mockito.exceptions.base.MockitoException at MockDefinition.java:154
            Caused by: java.lang.IllegalStateException at AnnotationValue.java:2573

1 test completed, 1 failed

FAILURE: Build failed with an exception.
...
```

Then, change `useIR = true` to `useIR = false` in `build.gradle.kts`. Re-run the tests:

```
$ gw test

BUILD SUCCESSFUL in 4s
4 actionable tasks: 3 executed, 1 up-to-date
```
