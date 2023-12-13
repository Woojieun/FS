//테이블에 배송 테이블 3개 값 가져온거 뿌리기

$(document).ready(function () {

console.log("배송 페이지 진입");

    $.ajax({
        type: "GET",
        url: "/deliveryList",
        dataType: "json",
        success: function (dataFromServer) {
            var tableBody = $('#deliveryTableBody');

            dataFromServer.forEach(function (item) {
                var newRow = '<tr>' +
                    '<td>' + item.orderNum + '</td>' +
                    '<td>' + item.orderStatus + '</td>' +
                    '<td>' + item.orderContent + '</td>' +
                    '<td>' + item.orderUser + '</td>' +
                    '<td>' + item.orderDate + '</td>' +
                    '<td>' + item.deliveryDate + '</td>' +
                    '<td><a href="delivery_details.jsp" class="btn btn-primary">상세 보기</a></td>' +
                    '</tr>';

                tableBody.append(newRow);
            });
        },
        error: function (error) {
            console.error("Error fetching data:", error);
        }
    });
});