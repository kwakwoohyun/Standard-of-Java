## 자바의 정석 Chapter10

##### 1. 날짜와 시간
- java.util.Date

        Date는 날짜와 시간을 다루르 목적으로 JDK1.0부터 제공되어온 클래스이다.

- java.util.Calendar

        Calendar는 Date클래스의 빈약으로 인해 JDK1.1부터 제공되었다. 

        Calendar는 추상 클래스이기 때문에 직접 객체를 생성할 수 없고, 메서드를 통해서 완전히 구현된 클래스의 인스턴스를 얻어야 한다.

- Milli Seconds

        1/1000 초 단위
        
- get()

        필드 읽기

- set()

        필드 변경
    
- clear()

        필드 초기화
        
- add()
    
        특정 필드 값을 증가 또는 감소(다른 필드에 영향을 준다.)
        
- roll()

        특정 필드 값을 증가 또는 감소(다른 필드에 영향을 주지 않는다.)
        
- Date와 Calendar간의 변환

        Date의 메서드는 deprecated(사용하지 않을것을 권장) 되었지만 여전히 사용
        
        1. Calendar -> Date
        
            Calendar calendar = Calendar.getInstance();
                ...
            Date date = new Date(calendar.getTimeInMillis());
            
        2. Date -> Calendar 
        
            Date date = new Date();
                ...
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            
##### 2. 형식화 클래스
    java.text패키지의 DecimalFormat(10진수 숫자), SimpleDateFormat(날짜)
    
    숫자와 날짜를 원하는 형식으로 쉽게 출력 가능 (숫자, 날짜 -> 형식 문자열)
    
    반대로 형식 문자열에서 숫자와 날짜를 뽑아내는 기능(형식 문자열 -> 숫자, 날짜)
 
 2-1. DecimalFormat 
    
    숫자를 형식화 할때 사용 (숫자 -> 형식 문자열) (format)
    
    특정 형식의 문자열을 숫자로 변환할 때도 사용 (형식 문자열 -> 숫자) (parse)
    
 2-2. SimpleDateFormat
 
    날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다. (format)
    
    특정 현식의 문자열에서도 날짜와 시간을 뽑아낼 수 있다. (parse)