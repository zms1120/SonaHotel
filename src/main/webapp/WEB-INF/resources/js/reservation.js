function go_save() {
	var name = document.getElementById("name").value;
    var phone = document.getElementById("phone_number").value;
    var email = document.getElementById("email").value;
    var dateIn = document.getElementById("date-in").value;
    var dateOut = document.getElementById("date-out").value;
    var adults = document.getElementById("adults").value;

    if(name == ""){
    	alert("이름을 입력해 주세요");
    	 document.getElementById("name").focus();
    	 return false;
    } else if (phone == "") {
        alert("전화번호를 입력해 주세요.");
        document.getElementById("phone_number").focus();
        return false;
    } else if (phone.length != 11 || isNaN(parseInt(phone, 10))) {
        alert("'-' 제외 11자리 숫자를 입력해주세요.");
        document.getElementById("phone_number").focus();
        return false;
    } else if (!dateIn.trim()) {
        alert("체크인 날짜를 입력해주세요.");
        document.getElementById("date-in").focus();
        return false;
    } else if (dateOut == "") {
        alert("체크아웃 날짜를 입력해주세요.");
        document.getElementById("date-out").focus();
        return false;
    } else if (adults == 0) {
        alert("최소 1명 이상의 인원을 입력해주세요.");
        document.getElementById("adults").focus();
        return false;
    } else {
        $.ajax({
            type: "POST",
            url: "/reservation-detail",
            data: {
            	name: name,
                phone: phone,
                email: email,
                dateIn: dateIn,
                dateOut: dateOut,
                adults: adults
            },
            success: function (response) {
                console.log(response);
                // 서버로부터의 응답 처리
            },
            error: function (error) {
                console.log(error);
                // 에러 발생 시 처리
            }
        });
    }
    
}


