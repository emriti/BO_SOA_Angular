(function() {
	angular.module('invoice2', [ 'finance2' ]).controller(
			'InvoiceController',
			[
					'currencyConverter',
					function InvoiceController(currencyConverter) {
						this.qty = 1;
						this.cost = 1;
						this.inCurr = 'IDR'
						this.currencies = currencyConverter.currencies;

						this.total = function total(outCurr) {
							return currencyConverter.convert(this.qty
									* this.cost, this.inCurr, outCurr);
						};
						
						this.pay = function pay() {
							window.alert('Thanks!');
						};

					} ]);
})();