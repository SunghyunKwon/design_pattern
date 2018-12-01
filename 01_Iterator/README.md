Iterator patter<br>
- 순서대로 지정해서 처리하기<br>
-> Iterator patter 이란 무엇인가 많이 모여있는 것들을 순서대로 지정하면서 전체를 검색하는 처리를 실행하기 위한것<br>
-> Iterator를 사용하는 이유<br>
==> 구현과 분리해서 하나씩 셀 수 있기 때문<br>
    예제의 BookShelf 에서 while loop는 BookShelf 구현에는 의존하지 않고 있음.<br>
    따라서 Array 에서 Vector로 변경이 되어도 Iterator 인스턴스가 올바르게 전달되면 해당 코드는 문제가 발생하지 않음.<br>
