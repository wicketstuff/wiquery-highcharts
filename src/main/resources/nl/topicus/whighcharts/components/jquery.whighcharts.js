(function() {
	wHighChartsSerializeEvent = function(event) {
		return "event.currentTarget.name=" + event.currentTarget.name
				+ "&event.type=" + event.type 
				+ "&event.altKey=" + event.altKey
				+ "&event.ctrlKey=" + event.ctrlKey 
				+ "&event.shiftKey=" + event.shiftKey 
				+ "&event.checked=" + event.checked
				+ "&event.point.category=" + event.point.category
				+ "&event.chartX=" + event.chartX 
				+ "&event.chartY=" + event.chartY 
				+ "&event.xAxis[0].value=" + event.xAxis.value
				+ "&event.xAxis[0].min=" + event.xAxis.min
				+ "&event.xAxis[0].max=" + event.xAxis.max
				+ "&event.yAxis[0].value=" + event.yAxis.value
				+ "&event.yAxis[0].min=" + event.yAxis.min
				+ "&event.yAxis[0].max=" + event.yAxis.max;
	};
})();
