(function() {
	angular
			.module('finance3', [])
			.factory(
					[
							'$http',
							function() {
								var YAHOO_FINANCE_URL_PATTERN = '//query.yahooapis.com/v1/public/yql?q=select * from '
										+ 'yahoo.finance.xchange where pair in ("PAIRS")&format=json&'
										+ 'env=store://datatables.org/alltableswithkeys&callback=JSON_CALLBACK';

								var currencies = [ 'IDR', 'USD', 'EUR' ];
								var usdToForeignRates = {};

								var convert = function(amount, inCurr, outCurr) {
									return amount * usdToForeignRates[outCurr]
											/ usdToForeignRates[inCurr];
								};

								var refresh = function() {
									var url = YAHOO_FINANCE_URL_PATTERN.replace('PAIRS', 'USD' + currencies.join('","USD'));
									return $http.jsonp(url).then(function(response) {
										var newUsdForeignRates = {};
										angular.forEach(response.data.query.result.rate, function(rate) {
											var currency = rate.id.substring(3,6);
											newUsdForeignRates[currency] = window.parseFloat(rate.Rate);
										});
										usdForeignRates = newUsdForeignRates;
									});
								};

								refresh();

								return {
									currencies : currencies,
									refresh : refresh
								};

							}

					]);
})();

/*
(function() {
	angular.module('finance2', []).factory(
			'currencyConverter',
			function() {
				var currencies = [ 'IDR', 'USD', 'EUR' ];
				var usdToForeignRates = {
					IDR : 13200,
					USD : 1,
					EUR : 1.12
				};

				var convert = function(amount, inCurr, outCurr) {
					return amount * usdToForeignRates[outCurr]
							/ usdToForeignRates[inCurr];
				};

				return {
					currencies : currencies,
					convert : convert
				};

			});
})();
*/