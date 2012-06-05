package nl.topicus.whighcharts.web.pages;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.whighcharts.web.pages.examples.AjaxBasicPage;
import nl.topicus.whighcharts.web.pages.examples.AreaBasicPage;
import nl.topicus.whighcharts.web.pages.examples.AreaInvertedPage;
import nl.topicus.whighcharts.web.pages.examples.AreaMissingPage;
import nl.topicus.whighcharts.web.pages.examples.AreaNegativePage;
import nl.topicus.whighcharts.web.pages.examples.AreasplinePage;
import nl.topicus.whighstock.web.pages.examples.HighStockCompareMultipleSeriesPage;
import nl.topicus.whighstock.web.pages.examples.HighStockDynamicUpdateSeriesPage;
import nl.topicus.whighstock.web.pages.examples.HighStockFlagMarkingEventsPage;
import nl.topicus.whighstock.web.pages.examples.HighStockSingleLinePage;
import nl.topicus.whighstock.web.pages.examples.HighStockTwoPanesPage;
import nl.topicus.whighstock.web.pages.examples.HighStockWithDataGroupingPage;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.util.ListModel;

public class HomePage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public HomePage()
	{
		List<Class< ? extends Page>> highChartPages = new ArrayList<Class< ? extends Page>>();
		List<Class< ? extends Page>> highStockPages = new ArrayList<Class< ? extends Page>>();

		/* HighChart Examples */
		highChartPages.add(AreaBasicPage.class);
		highChartPages.add(AreaInvertedPage.class);
		highChartPages.add(AreaMissingPage.class);
		highChartPages.add(AreaNegativePage.class);
		highChartPages.add(AreasplinePage.class);
		highChartPages.add(AjaxBasicPage.class);

		/* HighStock Examples */
		highStockPages.add(HighStockSingleLinePage.class);
		highStockPages.add(HighStockTwoPanesPage.class);
		highStockPages.add(HighStockCompareMultipleSeriesPage.class);
		highStockPages.add(HighStockWithDataGroupingPage.class);
		highStockPages.add(HighStockFlagMarkingEventsPage.class);
		highStockPages.add(HighStockDynamicUpdateSeriesPage.class);

		ListView<Class< ? extends Page>> links =
			new ListView<Class< ? extends Page>>("links", new ListModel<Class< ? extends Page>>(
				highChartPages))
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected void populateItem(ListItem<Class< ? extends Page>> item)
				{
					BookmarkablePageLink<Void> link =
						new BookmarkablePageLink<Void>("link", item.getModelObject());
					item.add(link);
					link.add(new Label("label", item.getModelObject().getName()));
				}
			};
		add(links);

		add(new ListView<Class< ? extends Page>>("highStocklinks",
			new ListModel<Class< ? extends Page>>(highStockPages))
		{
			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<Class< ? extends Page>> item)
			{
				BookmarkablePageLink<Void> link =
					new BookmarkablePageLink<Void>("link", item.getModelObject());
				item.add(link);
				link.add(new Label("label", item.getModelObject().getName()));
			}
		});
	}
}
