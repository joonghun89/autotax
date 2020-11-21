<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp" %>
<%@ include file="inc/topNav.jsp" %>
<%@ include file="inc/leftNav.jsp" %>

<!-- content start -->
<div class="tm-main uk-section uk-section-default caselist">
    <div class="uk-container uk-container-small uk-position-relative">
        <div>
 
		    <div class="uk-position-relative uk-heading-divider uk-padding-remove-bottom dc-padding-bottom">
		        <div class="uk-inline"><h2 class="uk-heading uk-margin-remove-bottom uk-margin-small-left">사건부</h2>
		        </div>
		        <div class="uk-inline uk-visible@m uk-position-bottom-right dc-padding-bottom uk-margin-small-right">
		        	<span class="uk-text-right">
			        	<ul class="uk-breadcrumb uk-margin-remove-bottom">
			        		<li ><a href="home">홈</a></li>
			        		<li class="uk-disabled">사건부</li>
			        	</ul>
		        	</span>
	        	</div>
		    </div>
    
			<div class="uk-card uk-card-default uk-card-body">
			    <div class="uk-placeholder">
			    	<form class="uk-grid-small" uk-grid>
			    		<div class="uk-width-auto">
				    		<div class="uk-margin">
						        <label class="uk-form-label" for="form-stacked-text">조회기간</label>
						        <div class="uk-form-controls">
						            <input class="uk-input input_date" id="form-stacked-text" type="text" placeholder="2020-11-01">
						            <input class="uk-input input_date" id="form-stacked-text" type="text" placeholder="2020-11-30">
						        </div>
						    </div>
					    </div>
					    <div class="uk-width-auto">
					    	<div class="uk-margin">
						        <label class="uk-form-label" for="form-stacked-text">거래처별</label>
						        <div class="uk-form-controls">
						            <select class="uk-select" id="form-horizontal-select">
						                <option>전체</option>
						                <option>하나은행 본점</option>
						                <option>거래처 A</option>
						                <option>거래처 B</option>
						                <option>거래처 C</option>
						            </select>
						        </div>
						    </div>
					    </div>
					    <div class="uk-width-auto">
					    	<div class="uk-margin">
						        <label class="uk-form-label" for="form-stacked-text">납부여부</label>
						        <div class="uk-form-controls">
						            <select class="uk-select" id="form-horizontal-select">
						                <option>전체</option>
						                <option>미접수</option>
						                <option>가입중</option>
						                <option>납부완료</option>
						                <option>미납부</option>
						            </select>
						        </div>
						    </div>
					    </div>
					    <div class="uk-width-auto">
					    	<label class="uk-form-label" for="form-stacked-text">성명/법인명</label>
					        <div class="uk-form-controls">
					            <input type="text" class="uk-input">
					        </div>
					    </div>
					    <div class="uk-width-auto">
					    	<label class="uk-form-label" for="form-stacked-text">부동산</label>
					        <div class="uk-form-controls">
					            <input type="text" class="uk-input">
					        </div>
					    </div>
					    <div class="uk-width-auto">
					    	<label class="uk-form-label" for="form-stacked-text">. </label>
					    	<div class="uk-form-controls">
					    		<button class="uk-button uk-button-default uk-button-secondary">검색</button>
				    		</div>
					    </div>
			    	</form>
			    	
			    </div>
			    
			    <table class="uk-table uk-table-small uk-table-divider">
			        <thead>
			        <tr>
			            <th><input class="uk-checkbox" type="checkbox" id=""></th>
			            <th>ID</th>
			            <th>상태</th>
			            <th>성명/법인명</th>
			            <th>은행거래처</th>
			            <th>등록일</th>
			            <th>부동</th>
			            <th>등기유형</th>
			            <th>채권최고액</th>
			            <th>납부여부</th>
			            <th>벌크</th>
			            <th>매크로</th>
			            <th>메모</th>
			            <th>종결일자</th>
			            <th>주민번호/법인번호</th>
			            <th>수정</th>
			            <th>삭제</th>
			        </tr>
			        </thead>
			        <tbody>
			        <tr>
			            <td><input class="uk-checkbox" type="checkbox" id=""></td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td>Data</td>
			            <td><img src="${pageContext.request.contextPath}/svg/pen-square-solid.svg" class="svg"></td>
			            <td><img src="${pageContext.request.contextPath}/svg/close-square-solid.svg" class="svg"></td>
			        </tr>
			        </tbody>
			    </table>
			      
			    
			    <ul class="uk-pagination uk-flex-center uk-margin-top" uk-margin>
				    <li><a href="#"><span uk-pagination-previous></span></a></li>
				    <li><a href="#">1</a></li>
				    <li class="uk-disabled"><span>...</span></li>
				    <li><a href="#">4</a></li>
				    <li><a href="#">5</a></li>
				    <li><a href="#">6</a></li>
				    <li class="uk-active"><span>7</span></li>
				    <li><a href="#">8</a></li>
				    <li><a href="#">9</a></li>
				    <li><a href="#">10</a></li>
				    <li class="uk-disabled"><span>...</span></li>
				    <li><a href="#">20</a></li>
				    <li><a href="#"><span uk-pagination-next></span></a></li>
				</ul>
				
				<div class="button_group">
					<a href="caseWrite" class="uk-button uk-button-basic uk-align-left">사건등록 <img src="${pageContext.request.contextPath}/svg/plus-square.svg" class="svg"></a>
					<button class="uk-button uk-button-macro uk-align-right">매크로 일괄실행 <img src="${pageContext.request.contextPath}/svg/macro.svg" class="svg"></button>
				</div> 
				
			</div>

        </div>
    </div>
</div>	
<!-- content end -->
	
<%@ include file="inc/footer.jsp" %>