package com.danil.stresson.data

import android.content.Context
import com.danil.stresson.R

interface StressRepository {
    fun context(): Context
    fun getWords(type: Int): List<Pair<String, String>>
}

val words = listOf(
    listOf("аэропорты", "аэропОрты", R.string.nouns),
    listOf("аэропорт", "аэропОрт", R.string.nouns),
    listOf("банты", "бАнты", R.string.nouns),
    listOf("бант", "бант", R.string.nouns),
    listOf("бороду", "бОроду", R.string.nouns),
    listOf("борода", "бородА", R.string.nouns),
    listOf("бухгалтеров", "бухгАлтеров", R.string.nouns),
    listOf("бухгалтер", "бухгАлтер", R.string.nouns),
    listOf("вероисповедание", "вероисповЕдание", R.string.nouns),
    listOf("водопровод", "водопровОд", R.string.nouns),
    listOf("газопровод", "газопровОд", R.string.nouns),
    listOf("гражданство", "граждАнство", R.string.nouns),
    listOf("дефис", "дефИс", R.string.nouns),
    listOf("дешевизна", "дешевИзна", R.string.nouns),
    listOf("диспансер", "диспансЕр", R.string.nouns),
    listOf("договорённость", "договорЁнность", R.string.nouns),
    listOf("документ", "докумЕнт", R.string.nouns),
    listOf("досуг", "досУг", R.string.nouns),
    listOf("еретик", "еретИк", R.string.nouns),
    listOf("жалюзи", "жалюзИ", R.string.nouns),
    listOf("значимость", "знАчимость", R.string.nouns),
    listOf("иксы", "Иксы", R.string.nouns),
    listOf("каталог", "каталОг", R.string.nouns),
    listOf("квартал", "квартАл", R.string.nouns),
    listOf("километр", "киломЕтр", R.string.nouns),
    listOf("конусов", "кОнусов", R.string.nouns),
    listOf("конус", "кОнус", R.string.nouns),
    listOf("корысть", "корЫсть", R.string.nouns),
    listOf("краны", "крАны", R.string.nouns),
    listOf("кремень", "кремЕнь", R.string.nouns),
    listOf("кремня", "кремнЯ", R.string.nouns),
    listOf("лекторов", "лЕкторов", R.string.nouns),
    listOf("лектор", "лЕктор", R.string.nouns),
    listOf("локтя", "лОктя", R.string.nouns),
    listOf("локоть", "лОкоть", R.string.nouns),
    listOf("локтей", "локтЕй", R.string.nouns),
    listOf("лыжня", "лыжнЯ", R.string.nouns),
    listOf("местностей", "мЕстностей", R.string.nouns),
    listOf("местность", "мЕстность", R.string.nouns),
    listOf("намерение", "намЕрение", R.string.nouns),
    listOf("нарост", "нарОст", R.string.nouns),
    listOf("недруг", "нЕдруг", R.string.nouns),
    listOf("недуг", "недУг", R.string.nouns),
    listOf("некролог", "некролОг", R.string.nouns),
    listOf("ненависть", "нЕнависть", R.string.nouns),
    listOf("нефтепровод", "нефтепровОд", R.string.nouns),
    listOf("новостей", "новостЕй", R.string.nouns),
    listOf("новость", "нОвость", R.string.nouns),
    listOf("ногтя", "нОгтя", R.string.nouns),
    listOf("ноготь", "нОготь", R.string.nouns),
    listOf("ногтей", "ногтЕй", R.string.nouns),
    listOf("отзыв(о_книге)", "Отзыв(о_книге)", R.string.nouns),
    listOf("отзыв(посла_из_страны)", "отзЫв(посла_из_страны)", R.string.nouns),
    listOf("отозвать", "отозвАть", R.string.nouns),
    listOf("отрочество", "Отрочество", R.string.nouns),
    listOf("партер", "партЕр", R.string.nouns),
    listOf("портфель", "портфЕль", R.string.nouns),
    listOf("поручни", "пОручни", R.string.nouns),
    listOf("приданое", "придАное", R.string.nouns),
    listOf("призыв", "призЫв", R.string.nouns),
    listOf("свёкла", "свЁкла", R.string.nouns),
    listOf("сироты", "сирОты", R.string.nouns),
    listOf("сирота", "сиротА", R.string.nouns),
    listOf("созыв", "созЫв", R.string.nouns),
    listOf("сосредоточение", "сосредотОчение", R.string.nouns),
    listOf("средства", "срЕдства", R.string.nouns),
    listOf("средство", "срЕдство", R.string.nouns),
    listOf("статуя", "стАтуя", R.string.nouns),
    listOf("столяр", "столЯр", R.string.nouns),
    listOf("таможня", "тамОжня", R.string.nouns),
    listOf("торты", "тОрты", R.string.nouns),
    listOf("туфля", "тУфля", R.string.nouns),
    listOf("цемент", "цемЕнт", R.string.nouns),
    listOf("центнер", "цЕнтнер", R.string.nouns),
    listOf("цепочка", "цепОчка", R.string.nouns),
    listOf("шарфы", "шАрфы", R.string.nouns),
    listOf("шофёр", "шофЁр", R.string.nouns),
    listOf("эксперт", "экспЕрт", R.string.nouns),
    listOf("верна", "вернА", R.string.adjectives),
    listOf("верный", "вЕрный", R.string.adjectives),
    listOf("значимый", "знАчимый", R.string.adjectives),
    listOf("красивее", "красИвее", R.string.adjectives),
    listOf("красивый", "красИвый", R.string.adjectives),
    listOf("красивейший", "красИвейший", R.string.adjectives),
    listOf("кухонный", "кУхонный", R.string.adjectives),
    listOf("ловка", "ловкА", R.string.adjectives),
    listOf("ловкий", "лОвкий", R.string.adjectives),
    listOf("мозаичный", "мозаИчный", R.string.adjectives),
    listOf("оптовый", "оптОвый", R.string.adjectives),
    listOf("прозорливый", "прозорлИвый", R.string.adjectives),
    listOf("прозорлива", "прозорлИва", R.string.adjectives),
    listOf("сливовый", "слИвовый", R.string.adjectives),
    listOf("брала", "бралА", R.string.verbs),
    listOf("бралась", "бралАсь", R.string.verbs),
    listOf("браться", "брАться", R.string.verbs),
    listOf("взяла", "взялА", R.string.verbs),
    listOf("взялась", "взялАсь", R.string.verbs),
    listOf("взяться", "взЯться", R.string.verbs),
    listOf("влилась", "влилАсь", R.string.verbs),
    listOf("влиться", "влИться", R.string.verbs),
    listOf("ворвалась", "ворвалАсь", R.string.verbs),
    listOf("ворваться", "ворвАться", R.string.verbs),
    listOf("воспринять", "воспринЯть", R.string.verbs),
    listOf("восприняла", "воспринялА", R.string.verbs),
    listOf("воссоздала", "воссоздалА", R.string.verbs),
    listOf("воссоздать", "воссоздАть", R.string.verbs),
    listOf("вручит", "вручИт", R.string.verbs),
    listOf("вручить", "вручИть", R.string.verbs),
    listOf("гнала", "гналА", R.string.verbs),
    listOf("гналась", "гналАсь", R.string.verbs),
    listOf("гнаться", "гнАться", R.string.verbs),
    listOf("добрала", "добралА", R.string.verbs),
    listOf("добрать", "добрАть", R.string.verbs),
    listOf("добралась", "добралАсь", R.string.verbs),
    listOf("добраться", "добрАться", R.string.verbs),
    listOf("дождалась", "дождалАсь", R.string.verbs),
    listOf("дождаться", "дождАться", R.string.verbs),
    listOf("дозвонится", "дозвонИтся", R.string.verbs),
    listOf("дозвониться", "дозвонИться", R.string.verbs),
    listOf("дозировать", "дозИровать", R.string.verbs),
    listOf("ждала", "ждалА", R.string.verbs),
    listOf("жилось", "жилОсь", R.string.verbs),
    listOf("житься", "жИться", R.string.verbs),
    listOf("закупорить", "закУпорить", R.string.verbs),
    listOf("занять", "занЯть", R.string.verbs),
    listOf("занял", "зАнял", R.string.verbs),
    listOf("заняла", "занялА", R.string.verbs),
    listOf("заняли", "зАняли", R.string.verbs),
    listOf("заперла", "заперлА", R.string.verbs),
    listOf("запереть", "заперЕть", R.string.verbs),
    listOf("запломбировать", "запломбировАть", R.string.verbs),
    listOf("защемит", "защемИт", R.string.verbs),
    listOf("защемить", "защемИть", R.string.verbs),
    listOf("звала", "звалА", R.string.verbs),
    listOf("звать", "звАть", R.string.verbs),
    listOf("звонит", "звонИт", R.string.verbs),
    listOf("звонить", "звонИть", R.string.verbs),
    listOf("кашлянуть", "кАшлянуть", R.string.verbs),
    listOf("клала", "клАла", R.string.verbs),
    listOf("клеить", "клЕить", R.string.verbs),
    listOf("кралась", "крАлась", R.string.verbs),
    listOf("красться", "крАсться", R.string.verbs),
    listOf("кровоточить", "кровоточИть", R.string.verbs),
    listOf("лгала", "лгалА", R.string.verbs),
    listOf("лила", "лилА", R.string.verbs),
    listOf("лилась", "лилАсь", R.string.verbs),
    listOf("литься", "лИться", R.string.verbs),
    listOf("наврала", "навралА", R.string.verbs),
    listOf("наврать", "наврАть", R.string.verbs),
    listOf("наделит", "наделИт", R.string.verbs),
    listOf("наделить", "наделИть", R.string.verbs),
    listOf("надорвалась", "надорвалАсь", R.string.verbs),
    listOf("надорваться", "надорвАться", R.string.verbs),
    listOf("назвалась", "назвалАсь", R.string.verbs),
    listOf("назваться", "назвАться", R.string.verbs),
    listOf("накренится", "накренИтся", R.string.verbs),
    listOf("накрениться", "накренИться", R.string.verbs),
    listOf("налила", "налилА", R.string.verbs),
    listOf("налить", "налИть", R.string.verbs),
    listOf("нарвала", "нарвалА", R.string.verbs),
    listOf("нарвать", "нарвАть", R.string.verbs),
    listOf("начать", "начАть", R.string.verbs),
    listOf("начал", "нАчал", R.string.verbs),
    listOf("начала", "началА", R.string.verbs),
    listOf("начали", "нАчали", R.string.verbs),
    listOf("обзвонит", "обзвонИт", R.string.verbs),
    listOf("обзвонить", "обзвонИть", R.string.verbs),
    listOf("облегчить", "облегчИть", R.string.verbs),
    listOf("облегчит", "облегчИт", R.string.verbs),
    listOf("облилась", "облилАсь", R.string.verbs),
    listOf("облиться", "облИться", R.string.verbs),
    listOf("обнялась", "обнялАсь", R.string.verbs),
    listOf("обняться", "обнЯться", R.string.verbs),
    listOf("обогнала", "обогналА", R.string.verbs),
    listOf("обогнать", "обогнАть", R.string.verbs),
    listOf("ободрала", "ободралА", R.string.verbs),
    listOf("ободрать", "ободрАть", R.string.verbs),
    listOf("ободрить", "ободрИть", R.string.verbs),
    listOf("ободрит", "ободрИт", R.string.verbs),
    listOf("ободриться", "ободрИться", R.string.verbs),
    listOf("ободрится", "ободрИтся", R.string.verbs),
    listOf("обострить", "обострИть", R.string.verbs),
    listOf("одолжить", "одолжИть", R.string.verbs),
    listOf("одолжит", "одолжИт", R.string.verbs),
    listOf("озлобить", "озлОбить", R.string.verbs),
    listOf("оклеить", "оклЕить", R.string.verbs),
    listOf("окружит", "окружИт", R.string.verbs),
    listOf("окружить", "окружИть", R.string.verbs),
    listOf("опошлить", "опОшлить", R.string.verbs),
    listOf("осведомиться", "освЕдомиться", R.string.verbs),
    listOf("осведомится", "освЕдомится", R.string.verbs),
    listOf("отбыла", "отбылА", R.string.verbs),
    listOf("отбыть", "отбЫть", R.string.verbs),
    listOf("отдала", "отдалА", R.string.verbs),
    listOf("отдать", "отдАть", R.string.verbs),
    listOf("откупорить", "откУпорить", R.string.verbs),
    listOf("отозвала", "отозвалА", R.string.verbs),
    listOf("отозвать", "отозвАть", R.string.verbs),
    listOf("отозвалась", "отозвалАсь", R.string.verbs),
    listOf("отозваться", "отозвАться", R.string.verbs),
    listOf("перезвонит", "перезвонИт", R.string.verbs),
    listOf("перезвонить", "перезвонИть", R.string.verbs),
    listOf("перелила", "перелилА", R.string.verbs),
    listOf("перелить", "перелИть", R.string.verbs),
    listOf("плодоносить", "плодоносИть", R.string.verbs),
    listOf("пломбировать", "пломбировАть", R.string.verbs),
    listOf("повторит", "повторИт", R.string.verbs),
    listOf("повторить", "повторИть", R.string.verbs),
    listOf("позвала", "позвалА", R.string.verbs),
    listOf("позвать", "позвАть", R.string.verbs),
    listOf("позвонит", "позвонИт", R.string.verbs),
    listOf("позвонить", "позвонИть", R.string.verbs),
    listOf("полила", "полилА", R.string.verbs),
    listOf("полить", "полИть", R.string.verbs),
    listOf("положить", "положИть", R.string.verbs),
    listOf("положил", "положИл", R.string.verbs),
    listOf("понять", "понЯть", R.string.verbs),
    listOf("поняла", "понялА", R.string.verbs),
    listOf("послала", "послАла", R.string.verbs),
    listOf("послать", "послАть", R.string.verbs),
    listOf("прибыть", "прибЫть", R.string.verbs),
    listOf("прибыл", "прИбыл", R.string.verbs),
    listOf("прибыла", "прибылА", R.string.verbs),
    listOf("прибыли", "прИбыли", R.string.verbs),
    listOf("принять", "принЯть", R.string.verbs),
    listOf("принял", "прИнял", R.string.verbs),
    listOf("приняла", "принялА", R.string.verbs),
    listOf("приняли", "прИняли", R.string.verbs),
    listOf("рвала", "рвалА", R.string.verbs),
    listOf("сверлит", "сверлИт", R.string.verbs),
    listOf("сверлить", "сверлИть", R.string.verbs),
    listOf("сняла", "снялА", R.string.verbs),
    listOf("соврала", "совралА", R.string.verbs),
    listOf("соврать", "соврАть", R.string.verbs),
    listOf("создала", "создалА", R.string.verbs),
    listOf("создать", "создАть", R.string.verbs),
    listOf("сорвала", "сорвалА", R.string.verbs),
    listOf("сорвать", "сорвАть", R.string.verbs),
    listOf("сорит", "сорИт", R.string.verbs),
    listOf("сорить", "сорИть", R.string.verbs),
    listOf("убрала", "убралА", R.string.verbs),
    listOf("убрать", "убрАть", R.string.verbs),
    listOf("углубить", "углубИть", R.string.verbs),
    listOf("укрепит", "укрепИт", R.string.verbs),
    listOf("укрепить", "укрепИть", R.string.verbs),
    listOf("черпать", "чЕрпать", R.string.verbs),
    listOf("щемит", "щемИт", R.string.verbs),
    listOf("щемить", "щемИть", R.string.verbs),
    listOf("щёлкать", "щЁлкать", R.string.verbs),
    listOf("довезенный", "довезЕнный", R.string.participles),
    listOf("загнутый", "зАгнутый", R.string.participles),
    listOf("занятый", "зАнятый", R.string.participles),
    listOf("занята", "занятА", R.string.participles),
    listOf("запертый", "зАпертый", R.string.participles),
    listOf("заселенный", "заселЕнный", R.string.participles),
    listOf("заселена", "заселенА", R.string.participles),
    listOf("кормящий", "кормЯщий", R.string.participles),
    listOf("кровоточащий", "кровоточАщий", R.string.participles),
    listOf("наживший", "нажИвший", R.string.participles),
    listOf("наливший", "налИвший", R.string.participles),
    listOf("нанявшийся", "нанЯвшийся", R.string.participles),
    listOf("начавший", "начАвший", R.string.participles),
    listOf("начатый", "нАчатый", R.string.participles),
    listOf("низведенный", "низведЕнный", R.string.participles),
    listOf("облегченный", "облегчЕнный", R.string.participles),
    listOf("ободренный", "ободрЕнный", R.string.participles),
    listOf("обостренный", "обострЕнный", R.string.participles),
    listOf("отключенный", "отключЕнный", R.string.participles),
    listOf("повторенный", "повторЕнный", R.string.participles),
    listOf("поделенный", "поделЕнный", R.string.participles),
    listOf("понявший", "понЯвший", R.string.participles),
    listOf("принятый", "прИнятый", R.string.participles),
    listOf("принята", "принятА", R.string.participles),
    listOf("прирученный", "приручЕнный", R.string.participles),
    listOf("проживший", "прожИвший", R.string.participles),
    listOf("снята", "снятА", R.string.participles),
    listOf("снятый", "снЯтый", R.string.participles),
    listOf("согнутый", "сОгнутый", R.string.participles),
    listOf("углубленный", "углублЕнный", R.string.participles),
    listOf("закупорив", "закУпорив", R.string.gerunds),
    listOf("начав", "начАв", R.string.gerunds),
    listOf("начавшись", "начАвшись", R.string.gerunds),
    listOf("отдав", "отдАв", R.string.gerunds),
    listOf("подняв", "поднЯв", R.string.gerunds),
    listOf("поняв", "понЯв", R.string.gerunds),
    listOf("прибыв", "прибЫв", R.string.gerunds),
    listOf("создав", "создАв", R.string.gerunds),
    listOf("вовремя", "вОвремя", R.string.adverbs),
    listOf("доверху", "дОверху", R.string.adverbs),
    listOf("донельзя", "донЕльзя", R.string.adverbs),
    listOf("донизу", "дОнизу", R.string.adverbs),
    listOf("досуха", "дОсуха", R.string.adverbs),
    listOf("засветло", "зАсветло", R.string.adverbs),
    listOf("затемно", "зАтемно", R.string.adverbs),
    listOf("красивее", "красИвее", R.string.adverbs),
    listOf("красиво", "красИво", R.string.adverbs),
    listOf("надолго", "надОлго", R.string.adverbs),
    listOf("ненадолго", "ненадОлго", R.string.adverbs)
    )

class StaticStressRepository(private val context: Context) : StressRepository {
    override fun context(): Context {
        return context
    }

    override fun getWords(type: Int): List<Pair<String, String>> {
        return words
            .filter { elem -> elem[2] == type || type == R.string.all }
            .map { elem -> Pair(elem[0], elem[1]) }
            .shuffled() as List<Pair<String, String>>
    }
}