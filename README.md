# MM PoC

Branch feature_mm_3_1: branch with basic lib-based multimodule implementation in kotlin compiled with kotlinc
Branch feature mm_3_2: branch with basic lib-based multimodule implementation in java compiled with javac

Hierarchy:
```
                                        app
                                         |
                           --------------------------------------
                           |                    |               |
                           |             :feature:main   :feature:secondary
                           |                    |               |
                           |                    |               |
                           |                    |               |
                           |                    |               |
                         :core ----------------------------------
                           |
                           |
                    --------------------
                    |                  |
           :entity:mainer       :entity:scanner
```
**:app** - aggregates all modules together  
**:feature:main** - declares MainActivity, MainPresenter. Uses :core to get MainInteractor and act with it  
**:feature:secondary** - just declares SecondActivity to navigate to  
**:core** - domain layer of application. Contains Core* DI classes and all interactors used by features  
**:entity:mainer**, **:entity:scanner** - Just entity stubs   

Steps:
1. Clean build (`./gradlew clean`). Remove all build directories;
2. Execute `./gradlew assembleDebug --profile`;
3. Check profile report; All compilation tasks must be executed for all modules;
4. Change code in *:entity* implementation (I've changed *:entity:mainer* -> `interface IMainer` (add doMain2() method)); run `./gradlew assembleDebug --profile`
5. Verify that *:entity* and modules dependent on it was recompiled (*:core* and *:entity:mainer* in my case);
6. Change code in *:core* implementation (i.e. MainInteractorImpl); run `./gradlew assembleDebug --profile`
7. Isolated changes should not affect dependent modules. Verify that only *:core* module was recompiled. *:feature* modules must stay unchanged

