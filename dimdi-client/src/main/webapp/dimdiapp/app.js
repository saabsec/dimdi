(function() {
	'use strict';
	
	var dimdiapp = angular.module('dimdi', [ 'ui.router' ]);
	
	dimdiapp.config(function($stateProvider, $urlRouterProvider) {
		
		var home = {
			name : 'home',
			url : '/home',
			templateUrl : function() {
				return 'dimdiapp/sites/home/home.html';
			},
			controller : 'HomeCtrl'
		};
		
		var view1 = {
			name : 'view1',
			url : '/view1',
			templateUrl : function() {
				return 'dimdiapp/sites/view1/view1.html';
			},
			controller : 'View1Ctrl'
		};
		
		var view2 = {
			name : 'view2',
			templateUrl : function() {
				return 'dimdiapp/sites/view2/view2.html';
			},
			controller : 'View2Ctrl'
		};
		
		var view3 = {
			name : 'view3',
			url : '/view3',
			templateUrl : function() {
				return 'dimdiapp/sites/view3/view3.html';
			},
			controller : 'View3Ctrl'
		};
		
		$stateProvider.state(home).state(view1).state(view2).state(view3);
		
		$urlRouterProvider.otherwise('/home');
		
	});
	
})();
