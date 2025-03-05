package com.example.laba22

// Класс с данными об отелях
object HotelsData {
    // Функция возвращает список отелей
    fun getHotels(): List<Hotel> {
        return listOf(
            Hotel(
                id = 1,
                name = "Гранд Отель Империал",
                address = "ул. Ленина, 10, Москва",
                rating = 4.8f,
                pricePerNight = 12000,
                description = "Роскошный пятизвездочный отель в центре Москвы с видом на Кремль. Включает спа-центр, фитнес-зал и три ресторана высокой кухни.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_1
            ),
            Hotel(
                id = 2,
                name = "Морской Бриз",
                address = "Набережная, 24, Сочи",
                rating = 4.5f,
                pricePerNight = 8000,
                description = "Современный отель на берегу Черного моря с собственным пляжем и аквапарком. Идеальный выбор для семейного отдыха.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_2
            ),
            Hotel(
                id = 3,
                name = "Северная Звезда",
                address = "пр. Невский, 43, Санкт-Петербург",
                rating = 4.7f,
                pricePerNight = 9500,
                description = "Исторический отель в стиле модерн с видом на Неву. Расположен в пешей доступности от основных достопримечательностей.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_3
            ),
            Hotel(
                id = 4,
                name = "Уральский Кедр",
                address = "ул. Малышева, 51, Екатеринбург",
                rating = 4.2f,
                pricePerNight = 5600,
                description = "Уютный отель в деловом центре Екатеринбурга. Славится своим СПА-центром и традиционной уральской кухней.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_4
            ),
            Hotel(
                id = 5,
                name = "Байкал Плаза",
                address = "ул. Ленина, 15, Иркутск",
                rating = 4.6f,
                pricePerNight = 7200,
                description = "Современный отель с панорамным видом на озеро Байкал. Предлагает экскурсии и активный отдых на природе.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_5
            ),
            Hotel(
                id = 6,
                name = "Волжская Ривьера",
                address = "Набережная, 7, Нижний Новгород",
                rating = 4.3f,
                pricePerNight = 6300,
                description = "Современный отель на берегу Волги с потрясающим видом на реку и исторический центр города.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_6
            ),
            Hotel(
                id = 7,
                name = "Сибирский Экспресс",
                address = "пр. Мира, 19, Новосибирск",
                rating = 4.1f,
                pricePerNight = 4900,
                description = "Бизнес-отель в центре Новосибирска с современными конференц-залами и рестораном сибирской кухни.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_7
            ),
            Hotel(
                id = 8,
                name = "Степная Жемчужина",
                address = "ул. Гагарина, 8, Астрахань",
                rating = 4.0f,
                pricePerNight = 4200,
                description = "Уютный отель в историческом здании с видом на Волгу. Известен своими рыбными деликатесами и гостеприимством.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_8
            ),
            Hotel(
                id = 9,
                name = "Южный Берег",
                address = "ул. Морская, 22, Ялта",
                rating = 4.9f,
                pricePerNight = 15000,
                description = "Элитный курортный отель с частным пляжем, винным погребом и СПА-центром мирового класса.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_9
            ),
            Hotel(
                id = 10,
                name = "Казанский Двор",
                address = "ул. Баумана, 9, Казань",
                rating = 4.4f,
                pricePerNight = 6800,
                description = "Отель в татарском стиле с видом на Казанский Кремль. Предлагает кулинарные мастер-классы и экскурсии.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_10
            ),
            Hotel(
                id = 11,
                name = "Арктика Люкс",
                address = "пр. Ленина, 82, Мурманск",
                rating = 4.2f,
                pricePerNight = 7500,
                description = "Северный отель с видом на Кольский залив. Организует туры для наблюдения за северным сиянием.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_11
            ),
            Hotel(
                id = 12,
                name = "Амурский Залив",
                address = "ул. Светланская, 11, Владивосток",
                rating = 4.5f,
                pricePerNight = 8200,
                description = "Современный отель с видом на Японское море. Славится свежими морепродуктами и близостью к достопримечательностям.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_12
            ),
            Hotel(
                id = 13,
                name = "Горное Плато",
                address = "ул. Санаторная, 14, Пятигорск",
                rating = 4.3f,
                pricePerNight = 5900,
                description = "Курортный отель у подножия Машука с собственными минеральными источниками и лечебницей.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_13
            ),
            Hotel(
                id = 14,
                name = "Золотое Кольцо",
                address = "ул. Октябрьская, 6, Суздаль",
                rating = 4.7f,
                pricePerNight = 7800,
                description = "Отель-музей в русском стиле с ресторанами традиционной кухни и программой народных гуляний.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_14
            ),
            Hotel(
                id = 15,
                name = "Донская Станица",
                address = "пр. Ворошиловский, 5, Ростов-на-Дону",
                rating = 4.1f,
                pricePerNight = 5400,
                description = "Отель в казачьем стиле с рестораном донской кухни и музыкальными вечерами.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_15
            ),
            Hotel(
                id = 16,
                name = "Алтайский Простор",
                address = "ул. Чуйская, 17, Барнаул",
                rating = 4.2f,
                pricePerNight = 4800,
                description = "Эко-отель с натуральными материалами, органической едой и оздоровительными программами.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_16
            ),
            Hotel(
                id = 17,
                name = "Кавказские Минеральные Воды",
                address = "ул. Курортная, 12, Кисловодск",
                rating = 4.6f,
                pricePerNight = 8500,
                description = "Исторический санаторий с лечебными программами, минеральными ваннами и диетическим питанием.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_17
            ),
            Hotel(
                id = 18,
                name = "Черноморская Ривьера",
                address = "ул. Приморская, 28, Анапа",
                rating = 4.4f,
                pricePerNight = 9300,
                description = "Семейный курортный отель с аниматорами, детскими площадками и собственным песчаным пляжем.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_18
            ),
            Hotel(
                id = 19,
                name = "Тюменский Двор",
                address = "ул. Республики, 18, Тюмень",
                rating = 4.0f,
                pricePerNight = 5200,
                description = "Современный бизнес-отель с термальными источниками и конференц-залами.",
                hasWifi = true,
                hasPool = true,
                imageResId = R.drawable.hotel_19
            ),
            Hotel(
                id = 20,
                name = "Приморский Бриз",
                address = "Набережная, 35, Калининград",
                rating = 4.5f,
                pricePerNight = 6700,
                description = "Отель в балтийском стиле с видом на море и традиционной кухней региона.",
                hasWifi = true,
                hasPool = false,
                imageResId = R.drawable.hotel_20
            )
        )
    }
}
