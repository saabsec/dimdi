(function() {
	'use strict';
	
	angular.module('dimdi').service('DIMDIMainService',
			[ '$log', '$http', function($log, $http) {
				$log.info('DIMDIMainService');
				
				var dimdimainservice = {};
				
				dimdimainservice.getDataFromServer = function(urlName) {
					$log.info('dimdimainservice.getDataFromServer got called');
					return $http({
						method : 'GET',
						url : 'http://localhost:8090/' + urlName,
						headers : {
							'Access-Control-Allow-Headers': 'Content-Type',
							'Access-Control-Allow-Methods': 'GET, POST, OPTIONS',
							'Access-Control-Allow-Origin': '*'
						},
						dataType : 'jsonp'
					}).then(function successCallback(response) {
						// this callback will be called asynchronously
						// when the response is available
						return response.data;
					}, function errorCallback(response) {
						$log.error(response);
						// called asynchronously if an error occurs
						// or server returns response with an error status.
					});
				};
				
				/**
				 * Ky funksion printon thjesht nje pershendetje
				 */
				dimdimainservice.sherbim = function() {
					$log.info("Hello Jona");
				};
				/**
				 * This function finds the sum of 9 numbers .From 1 to 9 and it returns the summ
				 */
				dimdimainservice.shuma= function() {
					var sum = 0; 
					for (var i = 0; i < 10 ; i++) {
					sum = sum +i ;
					}
					return sum;
				};
				
				return dimdimainservice;
				
			} ]);
	
})();
