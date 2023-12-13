<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="/resources/css/sidebar.css">
    <link rel="stylesheet" href="/resources/css/storage.css">
    <title>창고 관리</title>
</head>

<body>

    <div class="container-fluid">
        <div class="row">
            <!-- 왼쪽 고정 사이드바 -->
            <nav id="sidebar" class="col-md-3 col-lg-2 d-md-block bg-dark">
                <div class="position-sticky">
                    <ul class="nav flex-column">
                        <li class="nav-item">
                            <a id="pagename">FS</a>
                        </li>
                        <li class="nav-item mt-3">
                            <a class="nav-link" href="/dashboard">대시보드</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/user">회원</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/product">상품</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/delivery">당일/정기/예약</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/storage">창고</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="deliveryDropdown" role="button"
                                data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 문의
                            </a>
                            <div class="dropdown-menu" aria-labelledby="inquiryDropdown">
                                <a class="dropdown-item" href="/inquiry">문의</a>
                                <hr class="dropdown-divider">
                                <a class="dropdown-item" href="/inquiry_phone">상담</a>
                                <hr class="dropdown-divider">
                                <a class="dropdown-item" href="/refund">환불 문의</a>
                            </div>
                        </li>
                        <li class="nav-item fixed-bottom">
                            <a class="nav-link" href="#" id="logout">로그아웃</a>
                        </li>
                    </ul>
                </div>
            </nav>

            <!-- 메인 콘텐츠 -->
            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 mt-5">
                <div class="container">
                    <h1>창고 관리</h1>
                    <div class="form-group mt-5">
                        <!-- 종류 선택 -->
                        <div class="checkform d-flex">
                            <div class="form-check1">
                                <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                                <label class="form-check-label" for="flexCheckDefault">
                                    운영
                                </label>
                            </div>
                            <div class="form-check2">
                                <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                                <label class="form-check-label" for="flexCheckDefault">
                                    비운영
                                </label>
                            </div>
                            <div class="form-check3">
                                <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                                <label class="form-check-label" for="flexCheckDefault">
                                    예약
                                </label>
                            </div>
                        </div>

                        <!-- 검색 창 -->
                        <form class="d-flex searchform" role="search">
                            <select class="form-select" aria-label="Default select example">
                                <option selected>-- 전체 --</option>
                                <option value="1">창고 번호</option>
                                <option value="2">창고 위치</option>
                                <option value="3">회사명</option>
                            </select>
                            <input class="form-control me-2 searchinput" type="search" placeholder="정보를 입력해주세요"
                                aria-label="Search">
                        </form>

                        <!--여기서 부터 상품 목록 테이블 -->
                        <table class="table table-striped mt-4">
                            <thead>
                                <tr>
                                    <th>선택</th>
                                    <th>창고 번호</th>
                                    <th>창고 타입</th>
                                    <th>창고 위치</th>
                                    <th>회사명</th>
                                    <th>등록 상품</th>
                                    <th>창고 상태</th>
                                </tr>
                            </thead>
                            <!-- 상품 항목은 한 화면에 10개씩 보여주면 될 것 같음 -->
                            <tbody>

                            </tbody>
                        </table>

                        <!-- 모달 팝업 창 -->
                        <div class="modal modal_info" tabindex="-1">
                            <div class="modal-dialog modal-dialog-centered">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title s_name"></h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body s_infoAdd ">
                                        <!-- 여기에 상품 정보가 들어감-->
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary">수정</button>
                                        <button type="button" class="btn btn-primary">저장</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- 페이지 네이션 -->
                        <div class="d-flex justify-content-between align-items-center">
                            <nav aria-label="Page navigation" style="flex: 1;">
                                <ul class="pagination justify-content-center">
                                    <li class="page-item">
                                        <!-- 제일 처음으로 -->
                                        <a class="page-link" href="#" aria-label="First">
                                            <span aria-hidden="true"></span>«</span>
                                        </a>
                                    </li>
                                    <!-- 이전 -->
                                    <li class="page-item">
                                        <a class="page-link" href="#" aria-label="Previous">
                                            <span aria-hidden="true">&lt;</span>
                                        </a>
                                    </li>
                                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <!-- 다음 -->
                                    <li class="page-item">
                                        <a class="page-link" href="#" aria-label="Next">
                                            <span aria-hidden="true">&gt;</span>
                                        </a>
                                    </li>
                                    <!-- 제일 마지막으로 -->
                                    <li class="page-item">
                                        <a class="page-link" href="#" aria-label="Last">
                                            <span aria-hidden="true">»</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>

                            <button type="button" class="btn btn-primary" id="addStorage">등록</button>

                            <!-- 모달 팝업 창 -->
                            <div class="modal" id="addStorageModal" tabindex="-1">
                                <div class="modal-dialog modal-dialog-centered">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title">창고 등록</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                            <!-- 창고 등록 양식 -->
                                            <form>
                                                <!--                                                 <div class="mb-3">
                                                    <label for="warehouseNumber" class="form-label">창고 번호</label>
                                                    <input type="text" class="form-control" id="warehouseNumber"
                                                        placeholder="창고 번호를 입력하세요">
                                                </div> -->
                                                <div class="mb-3">
                                                    <label for="warehouseType" class="form-label">창고 타입</label>
                                                    <select class="form-select" id="warehouseType">
                                                        <option value="option1">냉장</option>
                                                        <option value="option2">냉동</option>
                                                        <!-- Add more options as needed -->
                                                    </select>
                                                </div>
                                                <div class="mb-3">
                                                    <label for="warehouseLocation" class="form-label">창고 위치</label>
                                                    <input type="text" class="form-control" id="warehouseLocation"
                                                        placeholder="창고 위치를 입력하세요">
                                                </div>
                                                <div class="mb-3">
                                                    <label for="companyName" class="form-label">회사명</label>
                                                    <input type="text" class="form-control" id="companyName"
                                                        placeholder="회사명을 입력하세요">
                                                </div>
                                                <div class="mb-3">
                                                    <label for="registeredProducts" class="form-label">등록 상품</label>
                                                    <textarea class="form-control" id="registeredProducts"
                                                        placeholder="등록 상품을 입력하세요"></textarea>
                                                </div>
                                                <div class="mb-3">
                                                    <label for="warehouseStatus" class="form-label">창고 상태</label>
                                                    <select class="form-select" id="warehouseStatus">
                                                        <option value="active">운영</option>
                                                        <option value="reserved">예약</option>
                                                    </select>
                                                </div>
                                            </form>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary"
                                                data-bs-dismiss="modal">취소</button>
                                            <button type="button" class="btn btn-primary addStorageInfo"
                                                id="addStorageInfo">저장</button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
            </main>
        </div>
    </div>

    <!-- Bootstrap 및 jQuery 스크립트 로드 -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous">
    </script>

    <script>
        $(document).ready(function () {
            console.log("실행");

            var pageSize = 10; // Number of items per page
            var currentPage = 1; // Current page, initially set to 1
            var selectedStatus = []; // Selected warehouse statuses
            var selectedSearchOption = 0; // Selected search option (0: 전체, 1: 창고 번호, 2: 창고 위치, 3: 회사명)
            var searchKeyword = ""; // Keyword for search

            // Attach click event handlers to status checkboxes
            $(".form-check-input").change(function () {
                updateSelectedStatus();
                fetchDataAndDisplay();
            });

            // Attach change event handler to search option dropdown
            $(".form-select").change(function () {
                selectedSearchOption = parseInt($(this).val());
                fetchDataAndDisplay();
            });

            // Attach input event handler to search input
            $(".searchinput").on("input", function () {
                searchKeyword = $(this).val().toLowerCase();
                fetchDataAndDisplay();
            });

            function updateSelectedStatus() {
                selectedStatus = [];
                $(".form-check-input:checked").each(function () {
                    selectedStatus.push($(this).next().text().trim());
                });
            }

            function displayData(data) {
                var tbody = $("table tbody");
                tbody.empty(); // Clear existing rows

                // Filter data based on selected warehouse statuses
                var filteredData;
                if (selectedStatus.length === 0) {
                    // If no status is selected, show all data
                    filteredData = data;
                } else {
                    // Otherwise, filter data based on selected statuses
                    filteredData = data.filter(function (item) {
                        return selectedStatus.includes(item.con_status);
                    });
                }

                // Filter data based on search option and keyword
                if (selectedSearchOption !== 0 && searchKeyword !== "") {
                    filteredData = filteredData.filter(function (item) {
                        var searchField;
                        switch (selectedSearchOption) {
                            case 1:
                                searchField = item.con_num;
                                break;
                            case 2:
                                searchField = item.con_id;
                                break;
                            case 3:
                                searchField = item.u_company;
                                break;
                            default:
                                break;
                        }
                        return searchField.toLowerCase().includes(searchKeyword);
                    });
                }

                // Calculate start and end index based on current page and page size
                var startIndex = (currentPage - 1) * pageSize;
                var endIndex = startIndex + pageSize;

                for (var i = startIndex; i < endIndex && i < filteredData.length; i++) {
                    var rowData = filteredData[i];
                    var row = $("<tr>");
                    row.append(
                        "<td><div class='form-check'><input class='form-check-input' type='checkbox' value=''></div></td>"
                    );
                    row.append("<td>" + rowData.con_num + "</td>");
                    row.append("<td>" + rowData.con_variety + "</td>");
                    row.append("<td>" + rowData.con_id + "</td>");
                    row.append("<td>" + rowData.u_company + "</td>");
                    row.append("<td>" + rowData.con_product + "</td>");
                    row.append("<td>" + rowData.con_status + "</td>");
                    tbody.append(row);
                }

                // Update pagination buttons
                updatePaginationButtons(filteredData.length);
            }
            
            // 각 테이블 행에 클릭 이벤트 리스너를 추가
            $("table tbody tr").click(function (event) {
                console.log("클릭");
                // 체크박스를 클릭한 경우 모달을 표시하지 않음
                if (!$(event.target).is(':checkbox')) {
                    // 클릭한 행의 데이터를 가져옴
                    var rowData = $(this).find("td");

                    // 모달 내용을 업데이트
                    $(".s_name").text("창고 정보 - " + rowData.eq(3).text()); // 창고 위치
                    $(".s_infoAdd").html(
                        "창고 번호: " + rowData.eq(1).text() + "<br/>" +
                        "창고 타입: " + rowData.eq(2).text() + "<br/>" +
                        "회사명: " + rowData.eq(4).text() + "<br/>" +
                        "등록 상품: " + rowData.eq(5).text() + "<br/>" +
                        "창고 상태: " + rowData.eq(6).text()
                    );

                    // 모달 표시
                    $(".modal_info").modal("show");
                }
            });
            

            function updatePaginationButtons(totalItems) {
                var totalPages = Math.ceil(totalItems / pageSize);
                var pagination = $(".pagination");
                pagination.empty(); // Clear existing pagination buttons

                // Add Previous button
                pagination.append(
                    "<li class='page-item'><a class='page-link' href='#' aria-label='Previous'><span aria-hidden='true'>&lt;</span></a></li>"
                );

                // Add page buttons
                for (var i = 1; i <= totalPages; i++) {
                    pagination.append("<li class='page-item'><a class='page-link' href='#'>" + i + "</a></li>");
                }

                // Add Next button
                pagination.append(
                    "<li class='page-item'><a class='page-link' href='#' aria-label='Next'><span aria-hidden='true'>&gt;</span></a></li>"
                );

                // Attach click event handlers to page buttons
                pagination.find("a.page-link").click(function () {
                    var page = parseInt($(this).text());
                    if (!isNaN(page)) {
                        currentPage = page;
                        fetchDataAndDisplay();
                    } else if ($(this).attr('aria-label') === 'Previous' && currentPage > 1) {
                        currentPage--;
                        fetchDataAndDisplay();
                    } else if ($(this).attr('aria-label') === 'Next' && currentPage < totalPages) {
                        currentPage++;
                        fetchDataAndDisplay();
                    }
                });
            }

            function fetchDataAndDisplay() {
                $.ajax({
                    type: 'GET',
                    url: '/getStorage',
                    dataType: 'json',
                    success: function (data) {
                        console.log('서버에서 받은 데이터:', data);

                        // Display data for the current page
                        displayData(data);
                    },
                    error: function (error) {
                        console.error('오류 발생:', error);
                    }
                });
            }

            // Initial data fetch and display
            fetchDataAndDisplay();
        });

        $(document).on('click', 'table tbody tr', function(event) {
                console.log("클릭");
                // 체크박스를 클릭한 경우 모달을 표시하지 않음
                if (!$(event.target).is(':checkbox')) {
                    // 클릭한 행의 데이터를 가져옴
                    var rowData = $(this).find("td");

                    // 모달 내용을 업데이트
                    $(".s_name").text("창고 정보 - " + rowData.eq(3).text()); // 창고 위치
                    $(".s_infoAdd").html(
                        "창고 번호: " + rowData.eq(1).text() + "<br>" +
                        "창고 타입: " + rowData.eq(2).text() + "<br>" +
                        "회사명: " + rowData.eq(4).text() + "<br>" +
                        "등록 상품: " + rowData.eq(5).text() + "<br>" +
                        "창고 상태: " + rowData.eq(6).text()
                    );

                    // 모달 표시
                    $(".modal_info").modal("show");
                }
            });



        // JavaScript로 모달 열기
        document.getElementById('addStorage').addEventListener('click', function () {
            var myModal = new bootstrap.Modal(document.getElementById('addStorageModal'));
            myModal.show();
        });

        $("#addStorageModal").on("hidden.bs.modal", function () {
            // 모달이 닫힐 때 폼을 초기화합니다
            $("#addStorageModal form")[0].reset();
        });

        $("#addStorageModal").on("click", ".btn-primary", function () {
            // 폼 데이터 가져오기
            var formData = {
                u_id: "id",
                u_company: $("#companyName").val(),
                con_id: $("#warehouseLocation").val(), // 창고 위치는 con_id로 수정
                con_variety: $("#warehouseType option:selected").text(),
                con_pro_variety: $("#warehouseType option:selected").text(),
                con_product: $("#registeredProducts").val(),
                con_status: $("#warehouseStatus option:selected").text()
                // 다른 필드들을 필요에 따라 추가하세요
            };

            // 서버로 데이터 전송
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "/insertStorage",
                data: JSON.stringify(formData),
                success: function (response) {
                    // 성공 처리 (선택 사항)
                    console.log(response);
                    // 모달을 닫습니다.
                    $("#addStorageModal").modal("hide");
                },
                error: function (error) {
                    // 오류 처리 (선택 사항)
                    console.error(error);
                }
            });
        });
    </script>
</body>

</html>