GRADLE_USER_HOME="C:\gradle\gradle-8.4-bin\gradle-8.4"
JAVA_HOME="C:\Program Files\Java\jdk-17"
cd C:\bank\gradlebank; .\gradlew.bat --configure-on-demand clean build
Configuration on demand is an incubating feature.
> Task :app:clean

> Task :app:compileJava
Note: Some input files use unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

> Task :app:processResources
> Task :app:classes
> Task :app:jar
> Task :app:startScripts
> Task :app:distTar
> Task :app:distZip
> Task :app:assemble

> Task :app:compileTestJava
Note: C:\bank\gradlebank\app\src\test\java\com\abc\interestCalculationTest.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

> Task :app:processTestResources
> Task :app:testClasses

> Task :app:test

BankTest > maxi_savings_account() STANDARD_OUT
    02-11-2023 10:30:26 DEBUG value of total local variable before enetering htloop was 0.0
    02-11-2023 10:30:26 DEBUG value of total local variable was 0.0
    maxi_savings_account Fail

BankTest > customerSummary() STANDARD_OUT
    BankTest Success

BankTest > savings_account() STANDARD_OUT
    02-11-2023 10:30:26 DEBUG value of total local variable before enetering htloop was 0.0
    02-11-2023 10:30:26 DEBUG value of total local variable was 2.0
    savings_account Success

BankTest > totalInterestWithMultipleCustomersPaidTest() STANDARD_OUT
    02-11-2023 10:30:26 DEBUG value of total local variable before enetering htloop was 0.0
    02-11-2023 10:30:26 DEBUG value of total local variable was 10.5
    totalInterestWithMultipleCustomersPaidTest Fail

CustomerTest > testOneAccount() STANDARD_OUT
    testOneAccount Success

CustomerTest > testTwoAccount() STANDARD_OUT
    testTwoAccount Success

CustomerTest > testApp() STANDARD_OUT
    CustomerTest Fail

CustomerTest > testThreeAccounts() STANDARD_OUT
    testThreeAccounts Fail

TransactionTest > transaction() STANDARD_OUT
    TransactionTest Success

interestCalculationTest > testInterest1() STANDARD_OUT
    *** Jim's Account ***
    [ Date=2023-11-02, balance=1600.0, interest=0.0]
    [ Date=2023-11-01, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-31, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-30, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-29, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-28, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-27, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-26, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-25, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-24, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-23, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-22, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-21, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-20, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-19, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-18, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-17, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-16, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-15, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-14, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-13, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-12, balance=0.0, interest=0.0]
    [ Date=2023-10-11, balance=0.0, interest=0.0]
    [ Date=2023-10-10, balance=0.0, interest=0.0]
    [ Date=2023-10-09, balance=0.0, interest=0.0]
    [ Date=2023-10-08, balance=0.0, interest=0.0]
    [ Date=2023-10-07, balance=0.0, interest=0.0]
    [ Date=2023-10-06, balance=0.0, interest=0.0]
    [ Date=2023-10-05, balance=0.0, interest=0.0]
    [ Date=2023-10-04, balance=0.0, interest=0.0]
    [ Date=2023-10-03, balance=0.0, interest=0.0]
    ***********
    Total Interest: 4.383561643835617
    ***********
    Test Interest1 Success

interestCalculationTest > testInterest2() STANDARD_OUT
    *** Jim's Account ***
    [ Date=2023-11-02, balance=1000.0, interest=0.0]
    [ Date=2023-11-01, balance=1000.0, interest=0.13698630136986303]
    [ Date=2023-10-31, balance=1000.0, interest=0.13698630136986303]
    [ Date=2023-10-30, balance=1000.0, interest=0.13698630136986303]
    [ Date=2023-10-29, balance=1000.0, interest=0.13698630136986303]
    [ Date=2023-10-28, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-27, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-26, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-25, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-24, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-23, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-22, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-21, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-20, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-19, balance=1000.0, interest=0.0027397260273972603]
    [ Date=2023-10-18, balance=1000.0, interest=0.13698630136986303]
    [ Date=2023-10-17, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-16, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-15, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-14, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-13, balance=1600.0, interest=0.21917808219178084]
    [ Date=2023-10-12, balance=0.0, interest=0.0]
    [ Date=2023-10-11, balance=0.0, interest=0.0]
    [ Date=2023-10-10, balance=0.0, interest=0.0]
    [ Date=2023-10-09, balance=0.0, interest=0.0]
    [ Date=2023-10-08, balance=0.0, interest=0.0]
    [ Date=2023-10-07, balance=0.0, interest=0.0]
    [ Date=2023-10-06, balance=0.0, interest=0.0]
    [ Date=2023-10-05, balance=0.0, interest=0.0]
    [ Date=2023-10-04, balance=0.0, interest=0.0]
    [ Date=2023-10-03, balance=0.0, interest=0.0]
    ***********
    Total Interest: 1.8082191780821917
    ***********
    Test Interest2 Success

interestCalculationTest > testInterest3() STANDARD_OUT
    *** Tom's Account ***
    [ Date=2023-11-02, balance=1300.0, interest=0.0]
    [ Date=2023-11-01, balance=700.0, interest=0.0019178082191780824]
    [ Date=2023-10-31, balance=700.0, interest=0.0019178082191780824]
    [ Date=2023-10-30, balance=700.0, interest=0.0019178082191780824]
    [ Date=2023-10-29, balance=700.0, interest=0.0019178082191780824]
    [ Date=2023-10-28, balance=700.0, interest=0.0019178082191780824]
    [ Date=2023-10-27, balance=900.0, interest=0.002465753424657534]
    [ Date=2023-10-26, balance=900.0, interest=0.002465753424657534]
    [ Date=2023-10-25, balance=900.0, interest=0.002465753424657534]
    [ Date=2023-10-24, balance=900.0, interest=0.002465753424657534]
    [ Date=2023-10-23, balance=900.0, interest=0.002465753424657534]
    [ Date=2023-10-22, balance=600.0, interest=0.0016438356164383563]
    [ Date=2023-10-21, balance=600.0, interest=0.0016438356164383563]
    [ Date=2023-10-20, balance=600.0, interest=0.0016438356164383563]
    [ Date=2023-10-19, balance=600.0, interest=0.0016438356164383563]
    [ Date=2023-10-18, balance=600.0, interest=0.08219178082191782]
    [ Date=2023-10-17, balance=700.0, interest=0.09589041095890412]
    [ Date=2023-10-16, balance=700.0, interest=0.09589041095890412]
    [ Date=2023-10-15, balance=700.0, interest=0.09589041095890412]
    [ Date=2023-10-14, balance=700.0, interest=0.0019178082191780824]
    [ Date=2023-10-13, balance=700.0, interest=0.0019178082191780824]
    [ Date=2023-10-12, balance=0.0, interest=0.0]
    [ Date=2023-10-11, balance=0.0, interest=0.0]
    [ Date=2023-10-10, balance=0.0, interest=0.0]
    [ Date=2023-10-09, balance=0.0, interest=0.0]
    [ Date=2023-10-08, balance=0.0, interest=0.0]
    [ Date=2023-10-07, balance=0.0, interest=0.0]
    [ Date=2023-10-06, balance=0.0, interest=0.0]
    [ Date=2023-10-05, balance=0.0, interest=0.0]
    ***********
    Total Interest: 0.4021917808219178
    ***********
    Test Interest3 Success

transferTest > transfermoney() STANDARD_OUT
    TransferTest Success1
    TransferTest Success2
    TransferTest Fail3

> Task :app:check
> Task :app:build

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/8.3-rc-1/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 2s
10 actionable tasks: 10 executed
